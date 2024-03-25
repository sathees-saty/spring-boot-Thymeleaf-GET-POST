# spring-boot-Thymeleaf-GET-POST
Thymeleaf and GET, POST example

Using Thymeleaf in HTML5 with Spring Model Class (GET/POST method)
1)	Open Spring Tool Suite 4
2)	Create Spring Starter project called Result
3)	Add Spring Web and Thymelleaf from https://start.spring.io
4)	Click finish
5)	Create ResultController
6)	Create eventest and evenresult html files under templates folder.
7)	Make sure that you add 
<html xmlns:th="http://www.thymeleaf.org"> in the evenresult html
8)	In span we are using th: to get result object.
9)	Add spring.thymeleaf.cache=false in application properties to avoid re-starting server for HTML changes
10)	Right click ResultApplication, run as “spring boot app” , don’t select other option
11)	Server started in port 8080
12)	http://localhost:8080/evenForm - load the html page
13)	http://localhost:8080/processEven - find the number 
14)	Similar to this we have created html file to read user name and email and display in result page using POST method
15)	http://localhost:8080/
