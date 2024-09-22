<h1>
  Book API
</h1>


The Book API is a RESTful service for managing books. It allows users to create, update, delete, and retrieve information about books, as well as register and list events associated with each book.

This project is using a structure following Domain Driven Design principles. It includes extensive unit tests for Domain, Controller, and Service layers, as well as custom exception handling and validation to provide a robust and secure application.

<h1>Technologies Used:</h2>
  <ul>
    <li>Java 21</li>
    <li>Spring Boot</li>
    <li>Lombok</li>
    <li>Swagger</li>
  </ul>

<h1>Testing:</h3>
Extensive unit tests have been written and can be found in the /src/test/java directory. These tests cover the Domain, Controller and Service layers to ensure the robustness of the application.

<h1>Error Handling</h1>
This project uses a global exception handling mechanism using @ControllerAdvice annotation. This approach ensures that all exceptions are caught and appropriate HTTP status codes and error messages are returned to the client.

<h1>Validation</h1>
Request validation is implemented using JSR 380 (Bean Validation 2.0) annotations in combination with Hibernate Validator.

<h1>API Documentation</h1>
The API documentation follows the OpenAPI 3 standard and is generated using Swagger and is available at /swagger-ui.html endpoint.

<h1>Setup</h1>
To set up the API locally, follow these steps:

Clone the repository.
Make sure you have PostgreSQL installed and running.
Update the application.properties file with your database information.
Run the application using your preferred IDE or from the command line with ./mvnw spring-boot:run.


<h1>Endpoints</h1>
<b>Book:</b>
<ul>
  <li>GET /book: Get all books.</li>
  <li>POST /book: Add a new book.</li>
  <li>GET /book/{bookId}: Get a book by ID.</li>
  <li>PUT /book/{bookId}: Update an existing book.</li>
  <li>DELETE /book/{bookId}: Delete a book by ID.</li>
</ul>

For more details about each endpoint, including required parameters and response schemas, please check the Swagger API documentation.
