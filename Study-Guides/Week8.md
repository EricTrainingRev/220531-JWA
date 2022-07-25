# Week 8 Study Guide
## Webservice
Webservices are simply applications that allow for the transfering of information through the internet. Typically this is done by transfering the data via machine-friendly formatted data (python object is transfered as a JSON to a Java app accross the internet). There are many different architectural styles for creating Webservices, but we will focus on creating RESTful web services.
## REST
A Representational State Transfer (REST) service is a type of web service that is not directly used by humans. Instead, its inputs and outputs are in machine friendly format (think JSON, XML, etc) and this data is worked with instead of the Python/Java/Whatever data the human using the REST service is working with (the Python object, Java object, etc.). What this means is that a RESTful webservice does not send the actual object the user is working with: it sends a representation of the object accross the web. So for instance, if you have a Java and Python application that need to send information to each other, a RESTful web service could handle the communication for them. The Python app could take its data, convert it to JSON formatting, send it to the restful web service, and the service would handle the transfer over the web to the Java application, where it would parse the JSON and create a Java object based upon the data it recieved.
## REST Constraints
there are 6 constraints a RESTful web service must follow to be considered a true REST webservice
1. Client - Server architecture
    - RESTful web services are not complete applications: they do not handle any client logic.
    - with this architecture, feasibly any client-side tech could interact with your server: the data being sent to the client does not HAVE to be specific to any one particular software
2. Stateless
    - RESTful webservices do not keep track of the client: this is handled clientside
3. Cacheable
    - can cache information from the server clientside for optimization
4. Uniform Interface
    - This is a standard web service convention
        - resrouces handeled by a RESTful web service should be identifiable by a Uniform Resource Identifier (URI). For instance, if you are dealing with customers, their identifier in the path should be "customer"
        - you then use specific verbs with your URIs to determine what will actually happen
            - GET/customer/1 should get the information for customer 1
            - the meaning of the URI should be clear even without a description
        - Hypermedia as the Engine of Application State (HATEOAS) should also be followed
            - basically, instead of sending constant http requests to the server to navigate, clients should be able to use links (think hyperlinks) to navigate
5. Layered System
    - RESTful web services should be able to call other services
    - this is not something the client needs to be aware of
        - you might implement a layer of security that the RESTful web service has to pass the client request through before it hits your database, or the request could be rerouted somewhere, etc
6. (optional) Code on Demand
    - RESTful web services can return executable code (like Javascript) that the client web browser can execute
    - this is not a normal practice, and therefor it is optional

## HTTP 
Hyper Text Transfer Protocal is the most common way of sending information over the web. It is a request/response system that will always give the requester a response, even if that response is only to say that everything that could have gone wrong did go wrong. There are two parts to HTTP: the request and the response
- HTTP Request anatomy
    - HTTP Version 
    - URL
        - the URL (uniform resource locator) is what you see at the top of your browser
            - https://www.url-of-website-I-am-using.com/pathParam
    - VERB
        - the verb provides context for what your request is trying to do
            - GET
                - get information
            - PUT
                - replace information
            - POST
                - add information
            - PATCH
                - update information
            - DELETE
                - delete information
    - HEADERS
        - the meta data of the request
    - BODY
        - This is the content of your request. GET requests do not have a body
The HTTP response is a little different from the request
- HTTP Response anatomy
    - HTTP Version
    - HEADERS
        - the meta data of the reponse
    - BODY
        - this is whatever data is being returned within the request, if any is provided
    - STATUS CODE
        - this code represents how the request was handled (successfuly, failed, transfered, etc.)
            - 100
                - basic meta information
            - 200
                - success
            - 300
                - redirects
            - 400
                - CLIENT error
            - 500
                - SERVER error (this is really bad: developer error)
## Performance Testing
So far the kind of testing you have been doing would fall under the functional testing category: checking that your code is working as intended, whether in positive or negative situations, whether verifying state/behavior, etc. Performance testing comes into play after you have validated that your application is functioning correctly. This kind of testing is not to check if things work or not (since you have already done this) but instead it is to check the capabilities of the application.

There are a few common performance tests that are done consistently:
- Load testing
    - how well does your application handle multiple users?
- Stress testing
    - very similar to load testing, this kind of test checks to see how your application can handle weird/unique situations
        - what if 1000 people tried to log in to the same account at the same time?
        - what if 50 people try to buy the same item at the same time?
        - etc.
- Endurance testing
    - this is load testing over a long period of time: does your application still work as expected after a week or month of constant use? Sometimes problems won't reveal themselves until the application has been running or an extended period of time
        - have you set your logger to create new log files when the previous file gets too big?
        - did you forget to close your connections to your database, and so new connections are made with old ones never closing?
- Spike testing
    - these tests help determine how well (or poorly) your application can scale
        - can your application handle a sudden/overwhelming influx of users?
    - most modern cloud computing services (like Amazon and Google) provide tools for automatically scaling the resources you have access to based on the actual activity in your application. Spike testing can be used to check that your application is scaling appropriately based upon its use

## API Testing
API testing is a form of integration testing where you check that your application's API has been set-up correctly. The content you are testing for will change depending on the intended functionality of the endpoint you are testing. For instance, a request may only return a 204 (success with nothing to return) status code, so your API test would check that the correct status code is retrieved. If, however, the API was supposed to return data you might want your test to instead check that the returned value is what you expected.

There are a slew of tools you can use for API testing, here is a non-exhaustive list of some of them

- Postman
    - an API testing tool with a built-in test suite that allows for the easy creation of test criteria. It also provides a convenient means of mocking database responses
- Thunder Client
    - an extension for vsc, this tool allows for making basic HTTP requests and validating the responses
- SOAPUI
    - SOAPUI is a tool that can perform basic API testing and a large range of different performance tests for your web application.
        - the ui for this application is not the most user friendly

## Ethical Hacking
Ethical hacking is a process by which a company agrees to let one or more individuals attack their systems to determine where any weakness in their security are. This is a seperate idea from things like being a hacktivist who will try and break into secure systems for social justice purposes. Ethical Hacking is more of an agreement between parties where the hackers are given permission to try and access systems they technically don't have permission to see. This processes of trying to access information "unethically" with permission is called penetration testing.

## Penetration Testing
Penetration testing is a process by which one or more individuals try to access information they should not be able to acquire. There are many ways of doing this, and there is an organization that keeps track of the top 10 security concerns that organizations should be aware of/handle.

## SQL Injection
SQL injection is a process by which a malicious actor can try and manipulate SQL queries to gain access to information that they should not be able to access. This can happen if an application does not "sanitize" user inputs. The idea of sanitizing inputs is just putting in extra checks that the information being recieved from the user is what it is supposed to be, and if not, rejecting the user input.

## Cross Site Scripting
Cross Site Scripting (XSS) is a process by which malicious actors attempt to use bad code to steal/delete information from legitimate users of a web service. One common way of performing XSS is phising emails: an email that looks legit saying that someone tried to access your data illegally and you need to confirm/reset your information to protect it. Upon clicking the link in your email to confirm your data, you unwittingly send your personal info to the attacker, and upon entering more personal info into the website you are taken to, lose even more of your personal information, such as account access info (username/password), payment information, and potentially more.

## What is mvc?
The Model View Controller (MVC) design pattern is a way of building web applications that combines the business rule enforcement and database interactions into a single model layer, with a controller layer that handles incoming interactions from the end user, and sends relevant information to the view layer so that it can control what the end user sees.

## Model
The models of an MVC application handle both the business rules of the entities they represent and they also handle interacting with the relevant database/s to affect the state of the database and/or application

## View
The view handles crafting/sending the needed information for the end user to interact with your application. This could be sending data that the browser will use to populate the web page, it could be the actual html/data needed to craft the end user's web page, or it could be a combination of both

## Controller
The controller is the entrypoint for your application: this is where user input is sent initially, and it is this layer that will send relevant data to the proper model, and then once the model is done with that data, it sends it to the view in order for the end user to see whatever they are supposed to see.

## Testing Lifecycle
In the same way that the Software Development Lifecycle has different phases in which different tasks need to be accomplished, so to the Testing Lifcycle has its own phases (which often mirror the SDLC) in which different tasks need to be accomplished before moving on to the next.

1. Requirements Analysis Phase
    - Entry Requirements
        - Proper testing documentation
            - test policy
            - test plan
            - user stories
            - etc.
    - Exit Requirement
        - Up-to-date Requirements Traceability Matrix
2. Test Planning Phase
    - Entry Requirements
        - Requirements Traceability Matrix
        - general testing documentation ready to go
    - Exit Requirements
        - Test plan approved (the actual tests approved)
        - Effort Estimation cost approved
3. Test Case Development Phase
    - Entry Requirements
        - up to date RTM and your Test Plan (specificly the tests you need to do)
        - tests cases need to be written up
        - test data written out
    - Exit Requirements
        - tests actually written in code
        - test data created
4. Environment Setup Phase
    - Entry Requirements
        - System design/architectural documents
            - these just tell the developers the specifics of the tools they are working with
                - database connection credentials
                - connection details for virtual machine that will run application
                - etc
            - Environment setup plan
                - this will probably come from your DevOps team
    - Exit Requirements
        - Test environment needs to be set up
            - Smoke testing happens during this time
5. Test Execution Phase
    - Entry Requirements
        - Test Environment set up with test data
    - Exit Requirements
        - All tests are executed
        - All defects should be logged/tracked
6. Test Cycle Closure phase
    - Entry Requirements
        - Tests need to be done
    - Exit Requirements
        - Client approves/confirms work