# homifyTask
## App for consuming homify professionals and their projects(Backend restful service)
## To achieve this task toolset chosen as below :
   1.Java 8 : Programming language
   
   2.Eclipse IDE JD Oxygen : IDE
   
   3.MySql : Database
   
   4.Spring boot : Web Framework and dependency injection
   
   5.Spring data – Hibernate : Orm support
   
   6.Lomok : For clean entity management
   
   7.Postman: App to make the http requests.
   
   8.Build Tool : Maven

## About the Service
The service is for an app consuming homify professonals and their projects REST service. It uses an mySQL to store the data. You can also do with eg,in memory database h2. If your database connection properties work, you can call some REST endpoints defined in com.example.homifytest.controller

You can use this sample service to understand the conventions and configurations that allow you to create a DB-backed RESTful service. Once you understand and get comfortable with the app you can add your own services 

Here is what this little application demonstrates:

  * Packaging as a single war with embedded container (tomcat 8): No need to install a container separately on the host just run using the java -jar command
  
* Demonstrates how to list professionals info, creation,deletion,updation etc. endpoints automatically on a configured port. Inject your own list of professionals info with a few lines of code.

* Writing a RESTful service using annotation: supports both XML and JSON request / response; simply use desired Accept header in your request

* Exception mapping from application exceptions to the right HTTP response with exception details in the body

* Spring Data Integration with JPA/Hibernate with just a few lines of configuration and familiar annotations.

* Automatic CRUD functionality against the data source using Spring Repository pattern

## create a new professional 

 POST /api/notes API
 
 {
"header"      : "sample",
"Firstname"   : "xxx",
"lastname"    : "yyy",
"username"    : "xxxyyy",
"companyname" : "homify",
"phone"       : "123",
"email"       :"adb@gmail.com",
"website"     : "aaa.com",
"city"        : "berlin",
"country"     : "Germany",
"latitude"    : "32.0",
"longitude"   : "2.0",
"project"     : "zzz"
}

## Tasks which are not completed

1. Find all professionals by latitude and longitude

2. Find all professional by specific types

3. Security




