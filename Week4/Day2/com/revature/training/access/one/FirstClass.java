package com.revature.training.access.one;

public class FirstClass {
    /*
        You can use access modifiers to change the accessability of the classes, fields, and methods
        you create. There are four different modifiers you can use:
            public: accessible anywhere
            protected: accessible anywhere within the same package or a sub class
            default: no key word is used to set this level, only accessible within the same package
            private: only accessible within the class itself
     */

     public boolean publicField;
     protected boolean protectedField;
     boolean defaultField; // default uses no key word
     private boolean privateField;
}
