# Deployment 

### Create 
kubectl apply -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/06-deployment/deployment.yml

- kubectl get deployments --namespace microserviceworkshop : This will show was deployment created
- kubectl rollout status deployment/helloworld-deployment --namespace microserviceworkshop : This shows rollout status
- kubectl rollout history deployment/helloworld-deployment --namespace microserviceworkshop: This shows history of deployment
- kubectl rollout undo deployment/helloworld-deployment  --namespace microserviceworkshop : This will switch to previous version
- kubectl get rs  --namespace microserviceworkshop : Displays Replica set 
- kubectl get pods --show-labels --namespace microserviceworkshop : Displays automatically generated labels

### Delete Demo POD
kubectl delete -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/06-deployment/deployment.yml





