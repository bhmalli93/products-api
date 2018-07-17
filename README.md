This API will produce Product Pricing Information for a requested Product ID which is available in myRetail site.

Technologies Used : Java, SpringBoot,MongoDB,Maven,Spring Data,GitHub,Tomcat

How to Setup this Application

Clone this application from GitHub Location

https://github.com/bhmalli93/products-api

https://github.com/bhmalli93/products-api.git

Configure this Application as Maven.

How to run this Application:

Right Click on the Application and Go to Run AS -> RunConfigurations -> Select New Maven Build

And in the Goals use spring-boot:run to run the Application.

Your application will be run as SpringBoot Application.

How to Access Application.

http://localhost:8082/swagger-ui.html

or 

http://localhost:8082/health

How to Test the Application.

example Request  Type-GET  : http://localhost:8082/products/13860428

Excepted Output application/json: 

{
"id": "13860428",
"name": "The Big Lebowski (Blu-ray)",
"current_price": {
"value": "13.97",
"currency_code": "USD"
}
}

Other Instructions : Make Sure you have MongoDb up and running 
in Your Local Machine in order to run this application with out issues.




