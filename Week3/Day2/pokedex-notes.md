# Notes

## HTTP
Hyper Text Transfer Protocol is the most popular way of sending/recieving information across the web. It is a request/response system that gurantees the requester a response, even if that response is only to say that everything that could have gone wrong did go wrong.
- **request**
    - this is the information that you send to an API (application program interface) that has some information you want back
- **response**
    - this is the information that you get back from the API you make a request to

## JSON
JavaScript Object Notation is the most common way of storing information that is transfered across the web. JSONs are essentially just formatted strings. A typical JSON will look something like this:
```JSON
{
    "keyOne":"value one",
    "2":10,
    "myBoolean":false

}
```
JSONs can work with Strings, numbers, and booleans. They can also be stored in lists, and you can nest JSONs inside of other JSONs.

## The DOM
The Document Object Model is what the browser renders for you when you visit a web page. Your browser generates the DOM from the html file that it reads. This allows for users to interact with web pages simultaniously without interfering with one another. We can manipulate the DOM to make our web pages more dynamic

## Promise
A promise object is used in JavaScript when you are working with information that could take a long time to get, and therefore, stall the execution of your JavaScript. Promises work as placeholders for the information you eventually expect to recieve. These promise objects are typically used when making http requests on a web page.