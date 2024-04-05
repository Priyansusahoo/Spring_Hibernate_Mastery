# Learning SpringBoot (Chad Darby)

##  - Spring Starter
##  - Maven
##  - @Controller Vs @RestController
##  - @GetMapping
##  - @Value
##  - application.properties.
##  - [Actuator Endpoint - (e.g. health, info, beans, threaddump, mappings) prefix it with "actuator/"](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#actuator.endpoints)
            - e.g. of endpoint - (/actuator/info).
            - For More Details : Go to this section => (13.1. Enabling Production-ready Features -> 13.2. Endpoints).
##  - Spring-Security:
            - Customize endpoints like which endpoint to include and exclude in application.properties using Spring-Security.
##  - command-line:
        - Method 1:
            - Execute ${mvnw package} command in the project root directory(OS: Windows)
            - Then navigate to \target folder and execute this command ${java -jar [JAR FILE NAME]}
            - e.g. ${java -jar bluecomet-0.0.1-SNAPSHOT.jar}
        - Method 2:
            - Execute ${mvnw spring-boot:run}
            - This command will run app using Spring Boot Maven plugin.
##  - [SpringBean scope](https://docs.spring.io/spring-framework/reference/core/beans/factory-scopes.html) : 
###    - singleton : 
            (Default) Scopes a single bean definition to a single object instance for each Spring IoC container.
###    - prototype : 
            Scopes a single bean definition to any number of object instances.
###    - request : 
            Scopes a single bean definition to the lifecycle of a single HTTP request. That is, each HTTP request has its own instance of a bean created off the back of a single bean definition. Only valid in the context of a web-aware Spring ApplicationContext.
###    - session :
            Scopes a single bean definition to the lifecycle of an HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.
###    - globalSession :
            This creates a single bean instance per global HTTP session. It is valid only in the context of a portal application.
###    - application :
            Scopes a single bean definition to the lifecycle of a ServletContext. Only valid in the context of a web-aware Spring ApplicationContext.
###    - websocket :
            Scopes a single bean definition to the lifecycle of a WebSocket. Only valid in the context of a web-aware Spring ApplicationContext.