# POD

### Create Demo POD
kubectl create -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/create-first-pod/1-pod.yml

### Command go list  PODS 
  - kubectl get pods --all-namespaces
  - kubectl get pods --namespace microserviceworkshop
  - kubectl get pods -o wide --namespace microserviceworkshop
  - kubectl logs helloworld-pod --namespace microserviceworkshop


### Delete Demo POD
kubectl delete -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/create-first-pod/1-pod.yml





