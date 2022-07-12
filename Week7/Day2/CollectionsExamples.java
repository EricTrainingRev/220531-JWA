import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExamples{
    public static void main(String[] args) {
        /*
            List is actually an interface, not a class. It provides the basic methods that the specific 
            implementations of the interface can use. We will look at two specific implementation options:
            ArrayLists and LinkedLists
        */

        /*
            List:               this is the interface declaration
            <String>:           this is the generic declaration: this tells Java what kind of data will be stored
            new ArrayList<>():  this calls the ArrayList constructor, the ArrayList class implements the List interface
        */
        List<String> myArrayList = new ArrayList<>();

        myArrayList.add("This is the first string I added to the arraylist");
        // myArrayList.add(10); //this line would crash my code because 10 is an int, not a String

        System.out.println(myArrayList.get(0));

        myArrayList.remove("This is the first string I added to the arraylist");

        System.out.println(myArrayList.size());

        /*
            The main methods you will use for Lists are the following:
            add():      this will add an object into the List
            get():      this will return the object stored at the index position given
                            NOTE: trying to access an index position that does not exist will crash your code
            remove():   this will remove the object provided as an argument from the List
            size():     this will return the size of the List(# of elements in the list)
        */

        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        myArrayList.add("d");
        myArrayList.add("e");
        myArrayList.add("f");
        myArrayList.add("f");

        // Lists can make use of the enhanced for loop to iterate through their content
        for(String element : myArrayList){
            System.out.println(element);
        }

        /*
            There is another common data structure that implements List called LinkedList: this data structure is
            different in that the way information is stored is handled differently than an ArrayList.
         */

         /*
            Sets are a great tool for when you want to filter data, or to make sure that you are only working 
            with unique data. We will take a look at HashSets, but this is not the only data structure that
            implements the Set interface
         */

         Set<String> myHashSet = new HashSet<>();

         myHashSet.add("This is the first string added to the Set");

         // contains will return true if the element exists in the Set
         System.out.println(myHashSet.contains("This is the first string added to the Set"));

         myHashSet.remove("This is the first string added to the Set");

         myHashSet.add("a");
         myHashSet.add("b");
         myHashSet.add("c");
         myHashSet.add("d");
         myHashSet.add("e");
         myHashSet.add("f");
         myHashSet.add("f");
         myHashSet.add("f");
        // this loop will only show unique letters, because the extra f strings are not saved in the Set
         for(String element : myHashSet){
            System.out.println(element);
         }

        /*
            The main methods you will use for Sets are:
            add():      this will add an element to the Set
            contains(): this will return true if an element is inside of the Set
            remove():   this will remove an element from the Set
            addAll():   this will add all the unique elements from a collection to the Set
        */

        /*
            Maps are particularly useful when you know the specific data you want to work with on a consistent
            basis: oftentimes they are going to be a more optimal solution than using a List or Set. 

            Map:    This is the interface that contains the base methods
            <Integer, String> these are the generics for the key/value respectively

            NOTE: Integer is the class version of the int primative: Map/Collection classes require classes
            to work correctly, so Java has built in Class version of all primative data types. The process of Java
            converting primative data types into classes and back is called Autoboxing.
        */

        Map<Integer,String> myMap = new HashMap<>();

        // use put() to create key value pairs
        myMap.put(0, "first value");
        // use get(key) to get the value associated with a key
        System.out.println(myMap.get(0)); // if you reference a key that does not exist you will get null back

        myMap.put(1, "second value");
        myMap.put(2, "third value");
        myMap.put(3, "fourth value");
        myMap.put(4, "fifth value");

        // keySet() returns a Set object that contains the keys of the map
        System.out.println(myMap.keySet());
        // values() returns a Collection object that contains the values of the map
        System.out.println(myMap.values());

        // use remove to remove a key/value pair
        myMap.remove(0);


    }

}