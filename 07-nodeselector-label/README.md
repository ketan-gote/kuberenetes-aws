# Nodeselector

You can deploy POD on specific node.

First you need to add label to node using below command
- kubectl get nodes --show-labels : This show labels for nodes
- kubectl label nodes ip-172-20-44-75.ap-south-1.compute.internal server-type=high-specs


### Apply 
kubectl apply -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/07-nodeselector-label/nodeselector.yml

### Delete Demo POD
kubectl delete -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/07-nodeselector-label/nodeselector.yml





