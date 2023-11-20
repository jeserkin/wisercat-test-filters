# Wisercat Test Filters API

## Requirements
* Java 17
* Spring Boot 3.1.5
* Maven (with local repository reference)

## Structure is as follows
* `wisercat-test-filters-api` - Main business logic
* `wisercat-test-filters-schema` - Openapi and generated api/model classes
* `wisercat-test-filters-db` - docker-compose and scripts to pre-fill database

## Helpful commands
* To drop/create Postgres DB (Docker):
  * `docker-compose -f wisercat-test-filters-db/docker-compose.yml down -v`
  * `docker-compose -f wisercat-test-filters-db/docker-compose.yml up -d --force-recreate`

* Installing new dependencies if `offline` is `false` inside `.mvn/settings.xml`. To just build existing, switch `false` to `true` (once all dependencies are locally available).
  * `mvnw -s .mvn/settings.xml clean install -DskipTests`
* In case API changes and one needs to regenerate models/api classes
  * `mvnw -s .mvn/settings.xml clean install -P regenerate-swagger -DskipTests`

## Swagger
Swagger UI is accessible at `http://localhost:8080/swagger-ui/index.html`