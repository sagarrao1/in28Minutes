Before we start with the Flows, we need to configure application to use Spring MVC

Lets do a little bit of Refactoring. Mini Step 1: Rename package webapp to com.in28minutes.jee
We need Spring MVC Framework and its dependencies. Mini Step 2 : Add required jars to the project
Spring MVC uses Front Controller Pattern -> Dispatcher Servlet. Mini Step 3 : Add Dispatcher Servlet to web.xml
DispatcherServlet needs an Spring Application Context to launch. We will create an xml (/WEB-INF/todo-servlet.xml). Mini Step 4: Add Spring Context