# PostgreSQL

```
oc new-app postgresql:12~https://github.com/agbaroni/fuse-ocp-kafka.git#alessio --name test1-dbms --context-dir postgresql/ -e POSTGRESQL_USER=test1 -e POSTGRESQL_DATABASE=library -e POSTGRESQL_PASSWORD='Test123!' --as-deployment-config
```
