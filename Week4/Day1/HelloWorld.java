// to make a simple Hello world! show up in the console, I first need to make a class to even get started
public class HelloWorld{
    // to actually run your application, Java will look for a method called main, it requires some specific setup
    public static void main(String[] args){
        // NOW we are ready to write the code to print our statement to the console
        System.out.print("Hello world!");

        // to actually make the message print you first need to compile the java code
        // javac FileName.java
        // the command above creates a class file of the same name, which you can execute
        // java FileName (no need to add .class)
    }
}