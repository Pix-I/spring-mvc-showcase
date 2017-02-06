Pix-I Fork of the Spring MVC Showcase:
--------------------------------------
This is a fork from the showcase at: https://github.com/spring-projects/spring-mvc-showcase
I thought the original repository was a nice way to get started/understand some of the capabilities of Spring-MVC,
but it wasn't "complete" enough Imo. So I'll try to add a new component with some documentation and tests once in a while to make it better.

If you have a subject you'd like to see getting added to this showcase, or even a standalone repository, feel free to send me an email at: pix@pix-labs.com 


Spring MVC Showcase
-------------------
Demonstrates the capabilities of the Spring MVC web framework through small, simple examples.
After reviewing this showcase, you should have a good understanding of what Spring MVC can do and get a feel for how easy it is to use.
Includes project code along with a supporting slideshow and screen cast.

In this showcase you'll see the following in action:

* The simplest possible @Controller
* Mapping Requests
* Obtaining Request Data
* Generating Responses
* Message Converters
* Rendering Views
* Type Conversion
* Validation
* Forms
* File Upload
* Exception Handling

To get the code:
-------------------
Clone the repository:

    $ git clone git://github.com/Pix-I/spring-mvc-showcase.git

If this is your first time using Github, review http://help.github.com to learn the basics.

To run the application:
-------------------	
From the command line with Maven:

    $ cd spring-mvc-showcase
    $ mvn tomcat7:run [-Dmaven.tomcat.port=<port no.>] (In case 8080 is busy] 

or

In your preferred IDE such as SpringSource Tool Suite (STS) or IDEA:

* Import spring-mvc-showcase as a Maven Project
* Drag-n-drop the project onto the "SpringSource tc Server Developer Edition" or another Servlet 2.5 or > Server to run, such as Tomcat.

Access the deployed web application at: http://localhost:8080/spring-mvc-showcase/

