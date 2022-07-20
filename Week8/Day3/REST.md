# What is REST?
REST stands for Representational State Transfer: this is a very common design pattern for modern web applications. The benefit of using this system is that it can be tech agnostic: because you are working with representations of whatever data you are using, a RESTful web service can send representations of the data to wherever it needs to go, and when the data arrives, the software recieving the data can convert it into its own understandable form. This is typically handled by using JSONs to represent the data because JSONs are fundamentally just formatted strings, and just about every programming language can interpret strings. 

# REST constraints
There are 6 RESTful constraints that should be followed when creating a RESTful web application:
1. RESTful web services should follow a client - server architecture
    - RESTful web services are not complete applications in and of themselves. 
    - users do not directly interact with the server you create: this is handled by a clientside technology like a web page: the web pages in conjuntion with the web server you create compose the complete application. The app will not work correctly unless both entities are working correctly
2. RESTful web services are stateless
    - the web server should not keep track of the client: this should be handled clientside
3. Cacheable
    - the restful web service should be able to cache information clientside to speed up the user experience
4. RESTful web services should use uniform interfaces
    - this idea is actually a standard web convention
        - if interacting with books, the resource used to handle these books should be consistent
            - to GET all books: baseurl/book
            - to GET a specific book: baseurl/book/{identifier for specific book}
            - to GET a specific book based on its title: baseurl/book?title={specific info goes here}
    - Hypermedia as the Engine of Application State (HATEOAS) should be maintained
        - this is a fancy way of saying don't use http requests to navigate your web pages: use hyperlinks to do this
        - in other words, use your clientside technologies to send people to different web pages, not your RESTful application
5. RESTful web services should be capable of being layered systems
    - RESTful web services should be capable of making calls to other RESTful web services
        - this is not something the client needs to be aware of, just the developers
6. (optional) RESTful web services should be able to return executable code
    - This is not a normal practice, but RESTful web services should be able to return code that can be executed clientside