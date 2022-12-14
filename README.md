# Rick-and-Morty
### :pencil:Description
This is a simple project made to show work with outside API.

### :construction: Project structure
The project has 3-Tiers architecture and consists of:

- DAO tier - operation with database
- Service tier - there happens all business logic with data
- Controller tier - interaction between the user and the program via browser or any HTTP client

### :computer: Technologies
- Java 11
- SpringBoot
- PostgreSQL
- Lombok
- Liquibase
- Swagger
- Docker
### :hourglass_flowing_sand: Quickstart
1. #### Clone this repository
2. #### Set your database connection parameters in application.properties
```java
spring.datasource.url="URL_OF_DATABASE"
spring.datasource.username=USERNAME
spring.datasource.password=PASSWORD
spring.jpa.properties.hibernate.dialect="HIBERNATE_DIALECT"
```
_For example_
```java
spring.datasource.url=jdbc:postgresql://localhost:5432/rickandmorty
spring.datasource.username=postgres
spring.datasource.password=1111
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```
3. #### Run project
More details about endpoints you can know by url
```java
http://localhost:8080/swagger-ui/
```
Also, you can run app via docker, just run in terminal command
```java
docker pull vaaalik45/rick-and-morty-app
```

