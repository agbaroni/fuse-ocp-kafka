# Test1

## S2I Binary

```
mvn clean package oc:deploy
```

## S2I Source

```
oc new-app fuse7-java11-openshift:1.9~https://github.com/agbaroni/fuse-ocp-kafka#alessio --context-dir=fuse/test1 --as-deployment-config
```
