# Steps to using Servlet for the first time

## Step 1 - Get Tomcat 8.5

- https://tomcat.apache.org/download-80.cgi
- Get core windows service installer
- Install
- Remember location

## Step 2 - Make sure you have Eclipse IDE Enterprise edition
	
- Install it if you do not have it
- IntelliJ will not be an option for this

## Step 3 - Connect Eclipse to your server

- Open up server tab in Eclipse (go to window, show view, server, if server is not there then go to other)
- Select new server
- Choose tomcat 8.5
- Point to the tomcat folder
	- For me it is : C:\Program Files\Apache Software Foundation\Tomcat 8.5
- Finish
- Right click on server and run
- If there is an invalid port issue
	- Double click on the server
	- Go to the ports on the right and look for admin port (it will a ' - ')
	- Replace this ' - ' with a number
- Save it and run it again
- The server should run
- Go to on browser "localhost:8080" and check to see if you get a response from the server
	- it will be a 404, that's fine, at the bottom it will say apache tomcat

## Step 4 - Make a new Dynamic Web Project
	
- Click on file (top left)
- new project and select Dynamic Web Project
	- If its not there then go to other and find it
	- Still not there?

## Step 4.1 - Install Eclipse Java EE Developer Tools

- Go to Help -> Install New Software
- Enter the Eclipse latest update repository link:
	- https://download.eclipse.org/releases/latest/
- Filter the list by searching for `Java EE`
- Choose `Eclipse Java EE Developer Tools`
- Make sure to uncheck "Contact all update sites during install to find required software"
- Restart your IDE
- Now when you go to make a new project, go to other, search `Dynamic Web Project` and it should be there
- If it continues to be an issue and it is not appearing, install `Eclipse Java EE IDE`, it is basically the same IDE just not designed for use with Spring

---

- Give it a name
- Target runtime choose your server
- leave the rest as default and go next
- next again
- click on the check box for "Generate web.xml deployment descriptor"
- Finish

## Step 4.2 - Convert Dynamic Web Project to use Maven for Building

- Right click on the project name
- Select Configure -> Convert to Maven Project
- A "Create New POM" dialogue will appear, fill this out with the needed information
	- Group ID should match the reverse domain name of your company
	- This is why we typically use `com.revature`

## Step 5 - Test static HTML
	
- Right click on project, create new HTML file
- Save it in the webapp or webcontent folder
- Put some text in the body
- Right click on the file and choose run as > run on server
- Choose your server and app
- Restart the server
- it will load the html page now
- You can go on a browser and search on localhost:8080
	- my url is "http://localhost:8080/DemoServletApp/index.html"

## Step 6 - Servlet Processing Form

```html
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<form action="">
		Enter 1st Number : <input type="text" name="num1"><br>
		Enter 2nd Number : <input type="text" name="num2"><br>
		<input type="submit">
	</form>
</body>
</html>
```

- Make a new html page with the above
- Test to make sure it works and displays properly
- Action is empty so nothing will happen, change it to "add"
- Using it now does something but the url will point to no where, this is where servlet comes in
- Right click on project, make a new class, name "AddServlet" and package "com.revature"

```java
package com.revature;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		System.out.println("Result of adding: " + i + " and " + j + " is " + k);
	}
}
```

### Key points:
	- We are implementing a method called service which has to objects as parameters, HttpServletRequest and Response
	- This is used by Servlet and you do not have to call it yourself
	- To get a parameter that is passed from the form data, we use getParameter and the name of the parameter that was sent
		- to know the name sent, check you html page
- This is still not done
	- currently when you press submit, the tomcat server doesn't know you want to use that class
	- You need to configure this in the web.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" id="WebApp_ID" version="3.1">

	<servlet>
		<servlet-name>Greg</servlet-name>
		<servlet-class>com.revature.AddServlet</servlet-class>
	</servlet>
	
	<servlet-mapping>
		<servlet-name>Greg</servlet-name>
		<url-pattern>/add</url-pattern>
	</servlet-mapping>
</web-app>
```

### Key points:
	- Each servlet needs to be listed here with the <servlet> tag
		- A name is given, this is used to identify it with the servlet mapping tag
		- the servlet class needs the full package name
	- The servlet mapping is used to connect each servlet (by their name) to a url
	- The URL pattern is the same as the value of the action tag in the HTML
- Once this is done, restart the server
- Trying the form html page now should work
- Currently it prints to the console, we don't want that, to print to the page we use servlets response object in the method

```java
PrintWriter out = response.getWriter();
out.println("Result of adding: " + i + " and " + j + " is " + k);
```

- We make it throw an exception
- restart server, trying it now actually does stuff
