# Java

### Java Introduction
- Java is a high level programming language
    - it include automatic memory management
    - this lets you write code without worrying about memory optimization
- Java is a "compiled" language
    - this means that all of your source code (the code you write) is compiled at the same time, and then the code is executed
- Java is statically typed
    - you must declare the type of a variable when you create it
        - this is different from JavaScript which did not require declaring the variable type
- Java is strongly typed
    - Java does not allow the coercion of data types (once a string, always a string, etc)
- Java is an Object Oriented Programming language
    - it makes use of classes and objects
- Write once, run anywhere
    - If a computer has a Java Runtime Environemnt, then it can run a Java application
- Java has a rich open source community
    - there are a vast amount of libries of code you can add to your program

### JDK, JRE, JVM
- Java Development Kit
    - this contains the tools needed for a developer to create a Java application
        - compiler
        - debugger
        - documentation tools
        - etc.
- Java Runtime Environment
    - this contains the runtime libraries necessary for a Java app to run.
    - the runtime environment contains the Java Virtual Machine
- Java Virtual Machine
    - this is the software that takes your compiled code and runs it.
    - this means that if a jvm is present on a computer, you can run java applications

### Object Oriented Programming
Java follows OOP principles, which can be defined by the pillars of OOP, typically known by the acronym APIE:

- Abstraction
    - you do not need to know why/how something works to be able to use it
    - code implementation is abstracted away from the developer by using Abstract classes and Interfaces
- Polymorphism
    - objects can behave in different ways depending on their context
        - this typically happens via method overloading and method overriding
            - overloading is when you add different parameters to your method
            - overriding is when a child class changes the implementation of a parent class method
- Inheritance
    - classes can acquire their behaviors and attributes from another source
        - a parent class
        - an abstract class
        - an interface
- Encapsulation
    - classes can protect their cotent from unintended use and can define the way their content should be accessed through the use of access modifiers
        - this provides a small level of protection to prevent your code from accidentally interacting with itself in unintended ways

### Class vs Object
In Java Classes work like blueprints: they define what kinds of behaviors (think methods) and attributes (think fields or variables) their objects will have. Objects are implementations of classes: they actually contain the methods and variables dictated by the Class they were built off of
|Class|Object
|-----|-----|
|declared using the class keyword|declared using the new keyword|
|declared once| declared as many times as needed|
|no memory allocated| memory allocated when created|
|blueprint for objects| implementation of classes|