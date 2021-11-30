# Test1

## S2I Binary

```
mvn package oc:build // to create an ImageStream
mvn oc:resource oc:deploy // to deploy on OCP
```

## S2I Source

```
oc new-app fuse7-java11-openshift:1.9~https://github.com/agbaroni/fuse-ocp-kafka#alessio --context-dir=fuse/test1 --as-deployment-config
```


## Insert new author
```
curl -v -X POST http://<ocp_cluster>:8080/insertAuthor -H "Content-Type: application/json" -d '{"name":"Stan", "familyName":"Lee"}'
```