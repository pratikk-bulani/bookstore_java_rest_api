# Bookstore application

The design pattern used is Model-Controller. It is just a REST-API created using Spring Boot framework. It uses ODM (Object Document Mapping). The dataset is present in the file: books.json. The collection name used in MongoDB is "bookstore".

The following endpoints are exposed in the code:
1. Fetch all the books
```
HTTP GET: <domain_name:port_number>/api/books/
```
2. Fetch book with a particular title
```
HTTP GET: <domain_name:port_number>/api/books?title=<title of the book to be fetched>
```
3. Fetch book with a particular id
```
HTTP GET: <domain_name:port_number>/api/books/<book id>
```
4. Add a new book in the database
```
HTTP POST: <domain_name:port_number>/api/books/
Give the JSON object in the request body. Does not use APPLICATION_FORM_URLENCODED_VALUE.
```
5. Update the existing book in the database
```
HTTP PUT: <domain_name:port_number>/api/books?id=<id of the book to update>
Give the JSON object in the request body. The attributes of this JSON object is used to update the document in the database. Does not use APPLICATION_FORM_URLENCODED_VALUE.
```
6. Delete the existing book from the database
```
HTTP DELETE: <domain_name:port_number>/api/books/<book id>
```

In order to execute the following code:
1. First restore the books.json dataset to the MongoDB. Make sure the collection name is "bookstore" (or) change the connection string in src/main/application.properties
2. Make sure maven is installed.
```
mvn clean install
```
3. Run the spring application:
```
mvn spring-boot:run
```
4. Install the postman client to see the responses of our REST-API.
