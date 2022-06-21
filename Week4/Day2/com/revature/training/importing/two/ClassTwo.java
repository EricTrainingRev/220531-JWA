package com.revature.training.importing.two;

import com.revature.training.importing.one.ClassOne;

public class ClassTwo {
    public static void main(String[] args) {
        // because ClassOne and ClassTwo exist in different packages, we need the import statement above
        ClassOne myObject = new ClassOne(15,"my string",true);

        /*
            Please remember: when you add your arguments to the constructor (or really any other method)
            VSC will try and provide a tooltip letting you know the parameter each argument is being
            assigned to: you should NOT write out the name of the parameter and then the argument, just
            add your arguments
         */

         // to access fields in an object you use the dot operator and reference the name of the field
        System.out.println(myObject.myNumber);
    }
}
