# Week 7 study guide
## Git Intro 
Git is an incredibly popular version control software that helps developers collaborate on projects. Think of it as a central repository for the source code you are working on that many devolopers can work on simultaniously. The basic workflow for copying, modifying, and persisting the changes you make are as follows (note that this assumes you have already create a repository):
1. clone the repository you are going to be working with. If you have already done this you can skip to step 2
    - git clone repository_link_goes_here
2. to update the repository with the most recent code use the pull command
    - git pull repository_link_goes_here
3. to add your new work to staging use the add command
    - git add . (the period means add all new work to staging. Can also specify files and folders)
4. to commit your work you need to use the commit command
    - git commit -m "brief description of commit" (-m means you are adding a message to the commit)
5. when you are ready to push your new committed work to the repo you use the push command
    - git push
These are the basic commands you can use if working by yourself, but if you are working with a team you will want everyone to work on their own "branch" of the code for simultanious programming
## Branching Structure
Git's setup encourages developers to use a branching structure for their projects. This is done by thinking of your project as a "tree" that has multiple "branches". Your going to have a main branch: this is typically going to be your working code. You then will have development branches off the main branch that you and your fellow devlopers use to create new features and fixes for the main branch. You can make the structure as simple or complicated as needed for the project. The benefit of this branching structure is that you can work on your code without affecting the primary source code: by working on the source code and commiting it to a seperate branch from the main you are preventing any mistakes or bugs you add to the code from affecting the main source code. This adds a layer of protection to your project, but it is not a flawless system. You and any fellow developers still have to check your code for errors, but the structure provides built in protection from accidently ruining your main code because of an accidental upload.
1. clone the repo you will work with
    - make sure to cd into the create file: you should see an indication that you are in the cloned repo
2. create a new branch of the repo and make sure to switch to it (check-out the branch)
    - git checkout -b NewBranchName (the -b indicates you are creating a new branch, leave it off for an already created branch)
3. after adding and commiting your changes you need to do a slightly altered push
    - git push -u origin branch_you_are_pusing_to
    - this make sure that any fetch, pull, and push requests in the future will go to the remote repo you are working on
4. You now can make a pull request inside of github
    - go to the main branch of the repo and access the pull request
    - confirm the request
    - check for any merge conflicts
        - resolve the conflicts if need be
    - approve merge
    - (optional) delete old branch if it is no longer needed
## Merging
Merging is, simply put, combining two different branches. When you merge a branch it takes all the previous commits lump-sum and attempts to add the changes to the target branch. So, if you are attempting to update your main branch, you want it to be your selected branch you are working with. You would then use the command "git merge branch_you_want_to_merge" and it will take the committed data of the branch you indicate in the command and add its code to your currently selected branch. Much of this process can be handled in Github.

If you are trying to update an offshoot branch (you have been working on a feature you want to add to the main, and you created your own brnach for it) you can simply follow the Intro section commands to update your branch, then proceed to merge the changes into the main branch.
## Merge Conflicts
Merge conflicts happen when you try to merge between branches that have conflicting changes to the code (one branch deleted a line of code while the other adjusted the code instead of deleting it). In these instances you will be informed by git that there is a merge conflict and you will be prompted to fix it. This can ususally be handled in your IED, but you can also handle it in Github. You will be shown where the conflict is between the two branches: The information will look something like this:
```cli
>>>>>>>> HEAD

=========

<<<<<<<<< merging_branch
```
inbetween the head and ========== will be the conflicting code in your current branch, between the ======== and merging_branch will be the conflicting code of the other branch. To fix the conflict you can go into the offending branch, edit the code, re add and commit, then merge again. Some IDEs will allow you to see conflicts in real time and import the correct version of the conflict.
## Pull Requests (Code Review)
Pull requests create notifications for collaborators that the feature/fix you were working on is complete. It provdes an opportunity for the others to review your work, and you can even make new commits if changes need to be made within the pull request. This is particularly useful when you set up branch protection rules, like not allowing a pull request to be merged until one or more people who are not the initial requester approve of the request. You can create branch protection within github by going to the branch settings in the repository. Under protect matching branches you can require a pull request instead of direct merging with the main branch, and you can indicate how many people need to approve the pull request in the same section.

## Reverting Work
Sometimes mistakes are made and you will need to revert to old code to fix a mistake. When this happens you simply need to checkout an old commit, create a new branch from that old commit, and publish it to github. This will allow you take override new work that broke your code with your old work that you know was working as intended
1. check your commit logs (if the list is long use enter to scroll through the list, when the terminal says END use the q key to be able to type again)
```cli
git log --oneline
```
2. use git checkout and the id of the commit you want to revert to (can also revert specific files if you name them after the old commit id)
```cli
git checkout {old commit id} {individual files if you want them}
```
3. use the switch command and the -c flag to turn the old commit content into a new, working branch
```cli
git switch -c {name of new branch}
```
4. publish your branch and overwrite the broken code with your old working code
    - you can do this part either in vsc or in the terminal

## Git and VSC
While manual commands for all the actions above can work, VSC also has built in tools for executing your git commands. I would recommend using VSC to handle your git commands unless you don't have access to it.

## Collection API
![Collection API](CollectionHierarchy.png)
## Generics
Generics are used when you know the type something will be, but not the specifics. <> are used to indicate a generic. Generics provide type security with collection data types
```java
// the generic type goes inside the <> notation, lets the program know what type to expect
List<type> listName = new ArrayList<>(); // used to have to include type on right side, not so in Java 8
```
## Lists
- preserves order of entry
- indexable
- duplicates allowed
```java
// ArrayLists are arrays that can dynamically resize. Fast searching, slow adding
List<Integer> arrayList = new ArrayList<>();

// LinkedLists implement List and Queue. Composed of nodes that reference the next/previous node (double linked). Fast adding, slow searching
List<Integer> linkedList = new LinkedList<>();

/*
    The main methods you will use for Lists are the following:
    add():      this will add an object into the List
    get():      this will return the object stored at the index position given
                    NOTE: trying to access an index position that does not exist will crash your code
    remove():   this will remove the object provided as an argument from the List
    size():     this will return the size of the List(# of elements in the list)
*/
```
## Sets
- does not maintain order
- unique elements only
- not indexable
```java
// HashSets are backed by HashMap, fast insertion and search. Not indexable
Set<String> hashSet = new HashSet<>();

// TreeSets maintain order. insertion and removal is slow because of ordering. No null allowed
Set<String> treeSet = new TreeSet<>();

/*
    The main methods you will use for Sets are:
    add():      this will add an element to the Set
    contains(): this will return true if an element is inside of the Set
    remove():   this will remove an element from the Set
    addAll():   this will add all the unique elements from a collection to the Set
*/
```

## Non-Access Modifiers
Java includes some keywords that are not used to denote access levels: these three are the most common ones you will interact with in training
- static
    - marks the method/variable as part of the class scope
- final
    - makes a variable unable to be reassigned a new value
    - makes a method incapable of being overridden
    - makes a class incapable of being extended
- abstract
    - makes a class incapable of being instantiated
    - marks a method as being defined without any implementation, which must be handled somewhere else

There are other keywords as well, but we will not make much (if any) use of them:
- synchronized 
    - relevant to threads and preventing deadlock phenomena
- transient 
    - marks a variable as non-serializable, meaning it will not be persisted when written to a byte stream

## Functional Interfaces and Lambdas
Functional Interfaces are interfaces with a single method that is used to create lambda templates.
```java
@FunctionalInterface // the annotation informs the compiler the interface is a functional interface
interface MyFunctionalInterface{
    // this is the abstract method we will use as our lambda template
    int mathematics(int num);
}
```
Lambdas are a way to do functional programing in Java (sorta). Instead of tying a method to a class it (sorta) stands alone. You can call lambdas without needing to also call a class. Collections have a built in system for a lambda: the forEach() method
```java
List<String> names = new ArrayList<>();
names.add("Billy");
names.add("Bob");
names.add("Jill");
names.forEach(name -> System.out.println(name)); // notice name requires no type declaration
```
you can also create your own lambdas by creating functional interfaces and implementing their single abstract method
```java
@FunctionalInterface
interface MyFunctionalInterface{
    int mathematics(int num);
}
MyFunctionalInterface addFive = num -> num + 5;
System.out.println(addFive.mathematics(5)); // this will print 10
MyFunctionalInterface subtractFive = num -> num - 5;
System.out.println(subtractFive.mathematics(5)); // this will print 0
```

## Javalin
Javalin is a lightweight framework that handles creating a web server that our applications can use to work with HTTP. The framework makes use of Handlers to determine how to respond to the HTTP requests you have exposed in the application.
```xml
    <!-- https://mvnrepository.com/artifact/io.javalin/javalin-bundle -->
    <dependency>
      <groupId>io.javalin</groupId>
      <artifactId>javalin-bundle</artifactId>
      <version>4.6.4</version>
    </dependency>
    <!-- this bundle dependency will give you lots of extra features you can explore when you are comfortable with the base Javalin tools -->
```
```java
// basic Javalin setup taken from the documentation website
import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(); // this makes the app listen on port 8080

        /*
            below is an example of "exposing" the API: we create a way for the end user to be able to interact
            with the application.

            Anytime the end user accesses the exposed endpoint they are "consuming" it: this is simply a way
            of describing an end user interacting with our API
        */
        app.get("/", ctx -> ctx.result("Hello World")); // this tells Javalin to return "hello world" when the base url is sent as an HTTP request
    }
}
```
For your projects you have been shown how to create controller classes that you use to inform Javalin how to handle HTTP requests
```java
// example controller class
import io.javalin.http.Handler;

public class ExampleController{
    // Handler is a functional interface we use to create our lambda that will be called when the route this lambda is assigned to is consumed
    public Handler helloWorld = ctx ->{
        ctx.result("Hello world");
        ctx.status(200);
    };
}
```
```java
// example main class
import io.javalin.Javalin;
import com.revature.controllers.ExampleController;

public class MainClass{
    public static void main(String[] args){
        ExampleController controller = new ExampleController();
        Javalin app = Javalin.create(); // can call a lambda in here to set configurations

        app.get("/", controller.helloWorld); // on a get request to this url(base+"/") will call the helloWorld lambda
    }
}
```
## Gson
Gson is a helpful library that can parse JSONs into java objects, and vice versa.
```java
Gson gson = new Gson();
String jsonContent = gson.body(); // turns the body of an http request into a String object
Object newObject = gson.fromJson(jsonContent, Object.class); // turns a JSON string into a java object
String newJson = gson.toJson(newObject); // turns a java object into a JSON string
```

## Mocking and Stubbing
Mocking is a useful tool for performing unit tests on methods that call one or more other methods in their execution (think of a service method that calls a dao method if all business logic checks out). By creating mock objects of any dependencies used in the method being tested we can create true unit tests by pre-determening the outcomes of all other methods not part of the test (this is called stubbing the results).

1. first add the necessary dependencies to your pom.xml (you will need to grab the testNG compatable version of Mockito if using testNG)
```xml
    <!-- https://mvnrepository.com/artifact/org.mockito/mockito-all -->
    <dependency>
      <groupId>org.mockito</groupId>
      <artifactId>mockito-all</artifactId>
      <version>2.0.2-beta</version>
      <scope>test</scope>
    </dependency>
```
2. You will then need your methods you are testing. for this example I am using a simple math function inside a class that is injected into a calculator class
```java
public class Mathy {
    public int mathematics(int num){
        return num / 2;
    }
}

public class Calculator {
    
    public Mathy mathy;
    
    public Calculator (Mathy mathy){
        this.mathy = mathy;
    }

    public String evenOdd(int num){
        int result = mathy.mathematics(num);
        if (result % 2 == 0){
            return "even";
        } else {
            return "odd";
        }
    }
}
```
3. once your classes and methods are set you need to create a test class. Create the two classes but set them to null at the start
```java
public class MockingTests {
    public Mathy mathy;
    public Calculator calculator;
}
```
4. Use the @BeforeAll annotation to create a setup method. Inside this method you are going to initialize the Mathy class as a Mockito object and pass in the Mathy class as an argument. This will allow you to mock the data you give and receive from the class
```java
@BeforeAll
public static void setup(){

    // because I am mocking the mathy class I instantiate it as a mock class
    mathy = Mockito.mock(Mathy.class);
    // I can then inject the mocked class and it works
    calculator = new Calculator(mathy);

}
```
5. You can now write your tests for the calculator method we are testing, but instead of having to return real values you can use Mockito to determine what is returned based upon the input
```java
@Test
public void mockReturnControl(){
    // look how I can control the return value here:
    // normally I would mock the value returned from a database, or something else that it is
    // impractical to constantly run test methods on
    Mockito.when(mathy.mathematics(5)).thenReturn(3); // this method would ACTUALLy return 2, but I can control the return
    String result = calculator.evenOdd(5); // this method passes the 5 into our mocked object that then calls the mathematics method which we have mocked
    Assert.assertEquals("odd", result); // this test will pass because 3 is an odd number
}

@Test
public void isEven(){
    Mockito.when(mathy.mathematics(12)).thenReturn(6); // this is the result we would expect, so we make it the return value
    String result = calculator.evenOdd(12);
    Assert.assertEquals("even", result);
}

@Test
public void isOdd(){
    Mockito.when(mathy.mathematics(10)).thenReturn(5); // this is the result we would expect, so we make it the return value
    String result = calculator.evenOdd(10);
    Assert.assertEquals("odd", result);
}

 @Test
    public void checkMathematicsCalledWithCorrectInput(){
        Mockito.when(mathy.mathematics(9)).thenReturn(4);
        calculator.evenOdd(9);
        // verify will throw an exception if the mock object does not call the method with desired input
        // this is the goal of mocking: checking that both the correct method and input are used. This is called
        // behavior verification
        Mockito.verify(mathy).mathematics(9);
    }

    @Test
    public void checkMathematicsCalledCorrectAmountOfTimes(){
        calculator.evenOdd(10);
        calculator.evenOdd(11);
        calculator.evenOdd(11);
        calculator.evenOdd(12);
        // use the times method if you want to check the amount of times a method with input is used
        Mockito.verify(mathy, VerificationModeFactory.times(2)).mathematics(11);
    }
```