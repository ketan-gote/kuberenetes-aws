# Secrets

## Create Secrets

You can create secret with help of either one

kubectl create secret generic db-secret --from-literal=username=dbuser --from-literal=password=Y4nys7f11 --namespace microserviceworkshop
OR

kubectl create -f https://raw.githubusercontent.com/ketan-gote/kuberenetes-aws/main/09-secrets/create-secret.yml

List all secret using : kubectl get secret --namespace microserviceworkshop