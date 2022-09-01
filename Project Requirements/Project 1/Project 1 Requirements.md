# Project 1 - Custom Object Relational Mapping Framework

## Description

Your project will be to create a custom object relational mapping (ORM) framework. This framework will allow for a simplified and SQL-free interaction with the relational data source. The requires of the project are purposefully vague, the intention is to allow for you to be creative in your implementation of this framework. There are many ways that this task can be approached, and you are encouraged to explore existing Java ORM implementations in order to get some inspiration. The minimum requirement for the custom ORM is to abstract JDBC boilerplate logic from the application which uses it.

Additionally, you will need to build a simple CRUD web application (what objects you CRUD is up to you). You should leverage the Java EE Servlet API to expose endpoints that allow for interaction with the application.

## Tech Stack
- [ ] Java 8
- [ ] JUnit
- [ ] Mockito
- [ ] Apache Maven
- [ ] Jackson library (for JSON marshalling/unmarshalling)
- [ ] Java EE Servlet API (v4.0+)
- [ ] PostGreSQL deployed on AWS RDS

## Functional Requirements
- [ ] CRUD operations are supported for one or more domain objects via the web application's exposed endpoints
- [ ] JDBC logic is abstracted away by the custom ORM 
- [ ] Programmatic persistence of entities (basic CRUD support) using custom ORM
- [ ] File-based or programmatic configuration of entities

## Non-Functional Requirements
- [ ] 70% line coverage of all service layer classes
- [ ] Usage of the java.util.Stream API within your project
- [ ] Custom ORM source code should be included within the web application as a Maven dependency
- [ ] Continuous integration pipelines that builds some main branch each project (the ORM and the web app, separately)

## Stretch Goals
- [ ] Custom ORM supports basic transaction management (begin, commit, savepoint, rollback) 
- [ ] Custom ORM supports connection pooling
- [ ] Session-based caching to minimize calls to the database for already retrieved data
- [ ] Deployment of web application to AWS EC2 (use of AWS Elastic Beanstalk is permitted) 

## Init Instructions
- Each person will need to create two repositories within the organization 
    - one for your custom ORM (naming convention: `initials-orm`, with your initials in place of "initials")
    - another for your web application (naming convention: `init-webapp`)

## Presentation
- Finalized version of custom ORM and web application must be pushed to personal repository within this organization by the presentation date before the first presentation starts. (Date TBD, not before Friday of Week 5)
- 5 minute live demonstration of the API (that leverages your custom ORM); demonstration will be performed using PostMan to query your API's endpoints

### Resources for researching ORMs
- [What is an ORM?](https://blog.bitsrc.io/what-is-an-orm-and-why-you-should-use-it-b2b6f75f5e2a)
- [Hibernate Documentation](https://hibernate.org/orm/documentation/5.4/)
- [JavaLite ActiveJDBC Documentation](https://javalite.io/documentation)
- [Using Java Reflection](https://www.oracle.com/technical-resources/articles/java/javareflection.html)
