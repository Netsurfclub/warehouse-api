warehouse-api
=============

### Inventory management application's backend.

[![Continuous integration](https://github.com/Netsurfclub/warehouse-api/actions/workflows/build.yml/badge.svg)](https://github.com/Netsurfclub/warehouse-api/actions/workflows/build.yml)

[Contributing Guide](.github/CONTRIBUTING.md)

Prerequisites
-------------

To avoid any unexpected application behaviour, make sure you have installed the following tools with the proper version numbers:

- [Eclipse Temurin JDK](https://adoptium.net/temurin/releases)
- [Maven 3.9.6](https://maven.apache.org/download.cgi)

Running project locally
-----------------------

### Creating database secrets configuration file

Before you start, make sure you set up a MySQL database locally on your machine, then perform these steps:

1. Install [v4.25.3](https://github.com/mikefarah/yq/releases/tag/v4.25.3) of [yq](https://github.com/mikefarah/yq) on your machine
2. Generate `database-secrets.yml` configuration file with this [shell script](./generate-database-secrets-file.sh)
3. Finally, provide your local database's secrets in place of `null` values

**Note that: this configuration file is excluded from git tracking, so don't worry about committing your database secrets!**

### Start application

```bash
mvn clean package

mvn spring-boot:run -Dspring-boot.run.profiles=default
```

To view GraphQL queries and mutations, open [GraphiQL](http://localhost:8080/graphiql) in your web browser.
