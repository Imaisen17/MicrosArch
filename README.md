#Compatibility Spring-Boot and Spring-cloud
https://spring.io/projects/spring-cloud
#Java mircoservices guide from dailyBuffer
https://www.youtube.com/watch?v=BnknNTN8icw
#Guige how to clone and open microservices project etc. Swifty
1 Basic method: clone and try to open this folder on you're IDE
###
2.1 git clone {url_project} 
2.2 open you're IDE 
2.3 file -> new -> project -> empty project 
2.4 import module (select each module which you need) 
But in this folder you did not exist any code from each microservices 
modules. Maven import modules and if you are changing some gode from 
this parent module(folder) change are will be displayed 
where you cloned the project
###
You also can copy all modules in new parent module (step 2) and do 
import (step 2). In this way all changes will display on you parent module
and you can see all changes in one plase (same in step 2, but you can try :))
###
If you want to do something with code repo (in future it will be private), please
WRITE ME!!!
###
You must modified cloud-config-server -> resources/application.yml to you're repository (if you want to modify configs)
Example:
eureka:
  client:
    register-with-eureka: true
    fetch-registry: true
    service-url:
      defaultZone: http://localhost:8761/eureka/
  instance:
    hostname: localhost
This module sharing all config from each services
###
Download zipkin-server and open this jar with java -jar ...
He will be able from http://localhost:9411/
This is logging service
You can find more info in guide (header)