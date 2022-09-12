# Spring Basics

---
The Spring Framework is an application framework and inversion of control container for the Java platform. One of the core functions of the Spring Framework is _**dependency injection**_, which is accomplished through the use of a _**inversion of control**_ container, known as the `ApplicationContext`.  The framework integrates with other specifications, namely:

- Dependency Injection (JSR 330)
- Servlet API (JSR 340)
- Bean Validation (JSR 303)
- JPA (JSR 338)

## Main Goals of Spring
---
The main goals of the Spring Framework include:
- Lightweight development with Java POJOs
- Dependency injection to promote loose coupling
- Declarative programming with Aspect-Oriented Programming (AOP)
- Minimize boilerplate Java code

## Terminology
---
Important Terminology
	
- **Beans**
  - instances which are managed by the Spring Framework

- **Dependency Injection**
  - the process of the Spring Framework actually injecting an instance of a dependency into a component (through auto-wiring or manual bean wiring)

- **Autowiring**
  - the process in which the Spring Framework identifies dependencies within a component, finds the corresponding component implementations and instantiates the dependency (or grabs an existing instance)

- **Inversion of Control**
  - the concept of the Spring Framework managing beans and performing dependency injection
  - developers hand over control over aspects of the application to the Spring Framework


- **IOC Container**
  - a general term that is used to refer to anything that is implementing Inversion of Control


- **Application Context**
  - the primary IOC container of the Spring Framework alternative to the Bean Factory IOC container implementation
  
- **Declarative Programming**
  - The ability to write code that says (declares) what we want to do, rather than how to do it.
  - Think of Java as being an imperative language, and SQL as a declarative language.
  - [Imperative vs Declarative](https://tylermcginnis.com/imperative-vs-declarative-programming/)

## Dependency Injection
---
Dependency injection is a technique whereby one object supplies the dependencies of another object. A dependency is an object is used as part of the operation of another object. Dependencies can be either mandatory or optional. The Spring Framework's `ApplicationContext` is an inversion of control container, also known as the _bean container_. This container is responsible for managing the lifecycle of all beans contained within it and providing them to the application code when requested.


# Spring Framework Modules
---
### Core Container
- Factory for creating beans
- Manages bean dependencies

#### Sub-modules:
- Beans
- Core
- SpEL (Spring Expression Language)
- Context
---

### Infrastructure
- Allows developers to add functionality to objects declaratively
- Logging, security, transactions, etc.

#### Sub-modules:
- AOP
- Aspects
- Instrumentation (used for remote monitoring of applications)
- Messaging
---

### Integration (Data Access Layer)

- Allows developers to communicate with DBs (relational or non-relational)
- Also allows functionality for communicating with a messaging queue

#### Sub-modules:
- JDBC
- ORM (Works very well with Hibernate)
- Transactions (Makes heavy use of AOP)
- OXM (Object XML Mapping)
- JMS (Java Message Service)
---

### Web Layer (MVC)

- Home of the Spring MVC framework

#### Sub-modules:
- Servlet
- WebSocket
- Web
- Portlet
---

### Test Layer
- Supports Test-Driven-Development (TDD)
- Allows for the mocking of objects and out-of-container testing

#### Sub-modules:
- Unit
- Integration
- Mock


---

## Hello World

This example will go over simple setup and working with a Spring Project using Spring Tool Suite. STS is not necessary to work with Spring, but the tutorials will be based around using the IDE so if you are not using STS then be ready to adapt the instructions to your own environment.

### 1 - Create a Maven Project

We will be making a simple Spring Project, and so we will not use the inbuilt Spring Project maker in STS as that is used to create Spring Boot Projects (will be shown later). For now create a standard Maven Project and edit to the POM to include at least this:

```XML
<properties>
	<maven.compiler.source>1.8</maven.compiler.source>
	<maven.compiler.target>1.8</maven.compiler.target>
</properties>


<dependencies>
	<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-context</artifactId>
		<version>5.3.22</version>
	</dependency>
</dependencies>

```

## 2 - Create Source Files

Create two files under the package `com.revature` named HelloWorld.java and Driver.java.

The code for both is shown below:

### HelloWorld

```java
package com.revature;

public class HelloWorld {
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your message: " + message);
	}
}

```


### Driver

```java
package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

		obj.getMessage();
	}
}

```

Some important regarding the Driver class:

- First step is to create an Application Context where we pass in a configuration file to describe how to create beans.
- Second step is to get the required bean using `getBean()` method from the context. This method takes in the Bean ID to get a generic object which is then casted to get the actual object. This then allows you to call any class methods from it.


## 3 - Create the Bean Configuration File

The Bean Configuration file is an XML file and maps the beans together with their classes. This needs to be in `src/main/resources` and named the same as you passed into the `ClassPathXmlApplicationContext()` so in this case we will call it `beans.xml`.

```XML
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

	<!-- XML based bean configuration -->
        
        <bean id="helloWorld" class="com.revature.HelloWorld">
        	<property name="message" value="Hello World!"/>
        </bean>
        
</beans>
```

When a Spring App gets loaded, the framework uses the configuration file to create all the beans defined and assigns them a unique ID as defined in the `<bean>` tag. The `<property>` tag can be used to pass values of different variables during the object creation.


## 4 - Run the Program

Running the application from the Driver class should have no issues with compilation and running. The final output to the console should be:

`Your messsage: Hello World!`

## 5 - Challenge

After completing this, begin converting your Project 0 into a Spring Project and try to convert your objects into beans and see if you can maintain functionality. There are some things you will need to research before you can complete it, here are a few with some resources:

- Auto-wiring
	- http://websystique.com/spring/spring-beans-auto-wiring-example-using-xml-configuration/

- Annotation Based Configuration
	- https://www.digitalocean.com/community/tutorials/spring-configuration-annotation
	- Annotation based configuration is what is used commonly, but it is expected of you to understand XML configuration and how to use it
