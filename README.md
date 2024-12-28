# Hoshi (Gestão escolar)

## Requirements
```
npm install express
npm install --save-dev nodemon
npm install chalk@4.1.2
npm install --save-dev jest
npm install dotenv
npm install consign
npm install body-parser
npm install moment
npm install cors
npm install swagger-stats
```
## Run app using nodemon
```bash
cd app
./node_modules/.bin/nodemon index.js
```

## build and push image
```bash
docker build -t rotoku/hoshi:1.0.0 .
docker push rotoku/hoshi:1.0.0
```

## apply manifest into cluster
```bash
cd infra/dev
kubectl apply -f k8s.yaml
```

## Test de app at cluster
```bash
kubectl port-forward --address 0.0.0.0 svc/hoshi 3000:3000 -n development
```