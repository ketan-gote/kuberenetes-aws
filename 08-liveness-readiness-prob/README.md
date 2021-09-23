# Liveness & Readiness 

## Liveness
https://kubernetes.io/docs/tasks/configure-pod-container/configure-liveness-readiness-startup-probes/

The kubelet uses liveness probes to know when to restart a container. For example, liveness probes could catch a deadlock, where an application is running, but unable to make progress. Restarting a container in such a state can help to make the application more available despite bugs.

Many applications running for long periods of time eventually transition to broken states, and cannot recover except by being restarted. Kubernetes provides liveness probes to detect and remedy such situations.

### Demo 
kubectl apply -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/08-liveness-readiness-prob/liveness-readiness-prob.yml

The periodSeconds field specifies that the kubelet should perform a liveness probe every 5 seconds. The initialDelaySeconds field tells the kubelet that it should wait 5 seconds before performing the first probe





