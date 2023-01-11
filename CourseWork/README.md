# First start
```shell script
docker-compose up
```

# Keycloak
configure realm: http://localhost:8082/

# Server app
open in terminal dir "back"

```shell script
/mvnw compile quarkus:dev
```

# Client app
open in terminal dir "from-to-education"

```shell script
npm install
```

```shell script
ng serve
```

# Launch app
http://localhost:4200/
