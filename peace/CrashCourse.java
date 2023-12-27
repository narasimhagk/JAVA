// This is a comment

// This is a package declaration
// package com.fullstackclouddeveloper.tutorial;

// This imports the GsonBuilder class from the
// com.google.gson package
import com.google.gson.GsonBuilder;

// This is a class declaration. The source file must be saved
// in the package folder structure and have the filename that
// matches the class name plus the file extension .java
class MyFirstJavaApplication {

    // This is a String variable for an instance of this
    // class
    private String name;

    // This is the main method entrypoint for this application
    public static void main(String[] args) {
        // Get the name passed in as a program argument
        // on the command line
        String name = args[0];

        // Get a new instance of this application
        // passing in the name from above
        MyFirstJavaApplication app =
            new MyFirstJavaApplication(name);

        // Print out a message to the console
        app.print();

        // Print out this instance as JSON
        app.printAsJson();
    }

    // This is a class constructor and that take in a
    // String argument for a name
    public MyFirstJavaApplication(String name) {
        // This saves the name to the instance variable
        // name
        this.name = name;
    }

    // This is a private function that returns a String
    // message
    private String getMessage(String name) {
        // This creates a String message
        return "Hello, " + name + "!";
    }

    // This is a method that prints a message to the
    // console
    private void print() {
        // This gets the message passing in the name
        String message = getMessage(name);

        // This prints the message to the console
        System.out.println(message);
    }

    // This method prints out this class instance as
    // a JSON String
    private void printAsJson() {
        System.out.println(new GsonBuilder()
          .setPrettyPrinting()
          .create()
          .toJson(this));
    }
}