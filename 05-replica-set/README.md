# Replica Seet

### Create Replica Set
kubectl create -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/05-replica-set/1-replica-set.yml

This will creates two pod of helloworld

### Command go list  PODS 
  - kubectl get pods --all-namespaces
  - kubectl get pods --namespace microserviceworkshop
  - kubectl get pods -o wide --namespace microserviceworkshop
  - kubectl logs helloworld-pod --namespace microserviceworkshop


### Delete Demo POD
kubectl delete -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/05-replica-set/1-replica-set.yml





