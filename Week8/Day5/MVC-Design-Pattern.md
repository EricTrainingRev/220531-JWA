# What is mvc?
The Model View Controller (MVC) design pattern is a way of building web applications that combines the business rule enforcement and database interactions into a single model layer, with a controller layer that handles incoming interactions from the end user, and sends relevant information to the view layer so that it can control what the end user sees.

### Model
The models of an MVC application handle both the business rules of the entities they represent and they also handle interacting with the relevant database/s to affect the state of the database and/or application

### View
The view handles crafting/sending the needed information for the end user to interact with your application. This could be sending data that the browser will use to populate the web page, it could be the actual html/data needed to craft the end user's web page, or it could be a combination of both

### Controller
The controller is the entrypoint for your application: this is where user input is sent initially, and it is this layer that will send relevant data to the proper model, and then once the model is done with that data, it sends it to the view in order for the end user to see whatever they are supposed to see.