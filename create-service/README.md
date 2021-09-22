# Service

### Create Demo Service
kubectl create -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/create-first-pod/1-service.yml

This will automatically create Classic Load Balancer on AWS, once it is created go to Route 53 and define sub domain and map to new load balancer.

### Command go list  PODS 
  - kubectl get svc --all-namespaces
  - kubectl get svc --namespace microserviceworkshop
  - kubectl get svc -o wide --namespace microserviceworkshop


### Delete Demo POD
kubectl delete -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/create-first-pod/1-service.yml






