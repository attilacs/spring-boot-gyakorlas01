# Spring Boot practice

## VS Code
### Extensions
- Java Extension Pack
- Spring Boot Extension Pack
- Thunder Client
### Create
- Explorer
- Create Java Project
- Spring Boot
- Maven
### Dependencies
- Spring Boot Dev Tools
- Lombok
- Spring Web
- Spring Data JPA
- H2 Database
- Validation
### Annotations
#### Model
- Data (getter, setter)
- AllArgsConstructor
- NoArgsConstructor
## Build `jar`
```
./mvnw clean package
```
## Run `jar`
```
java -jar package-name.jar
```
## H2 Database
- url: [http://localhost:8080/h2-console/](http://localhost:8080/h2-console/)
- JDBC url: `jdbc:h2:mem:db`
- user: `user`
- password: `password`