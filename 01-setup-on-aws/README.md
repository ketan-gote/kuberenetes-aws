
#Kubernetes on AWS using Kops

## Create EC2 Instance
Create EC2 Instance on AWS and Login with your credentials

#1 
aws s3 mb s3://ketan-gote.link	--region ap-south-1

#1 
kops create cluster \
--name=ketan-gote.link \
--state=s3://ketan-gote.link \
--zones=ap-south-1a,ap-south-1b \
--node-count=2 \
--node-size=t3.micro \
--master-size=t3.micro \
--dns-zone=ketan-gote.link

Suggestions:
 * list clusters with: kops get cluster
 * edit this cluster with: kops edit cluster ketan-gote.link
 * edit your node instance group: kops edit ig --name=ketan-gote.link nodes-ap-south-1a
 * edit your master instance group: kops edit ig --name=ketan-gote.link master-ap-south-1a

Finally configure your cluster with: kops update cluster --name ketan-gote.link --yes --admin

#2
kops update cluster --name ketan-gote.link --yes --admin

Suggestions:
 * validate cluster: kops validate cluster --wait 10m
 * list nodes: kubectl get nodes --show-labels
 * ssh to the master: ssh -i ~/.ssh/id_rsa ubuntu@api.ketan-gote.link
 * the ubuntu user is specific to Ubuntu. If not using Ubuntu please use the appropriate user based on your OS.
 * read about installing addons at: https://kops.sigs.k8s.io/operations/addons.