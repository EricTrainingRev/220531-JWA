// package is used to group our entities together
package com.revature.entity;

// change from jakarta to javax:
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// this annotation indicates that this Pet class is going to be an entity (table) in our database
@Entity
// we can change the name:
// @Table(name = "newname")
// this pet class is going to be mapped to a table in our database:
public class Pet {


    // how do we access these variables outide of the class if they're private?
    // this annotation indicates that id field is our primary key
    @Id
    // the ids will be generated to be unique:
    @GeneratedValue
    private int id;
    private String name;
    private String species;
    private String color;
    private int age;
    private int legs;
    private String breed;

    // default constructor, takes in no paramaters and doesn't do anything
    public Pet () {

    }

    // make a constructor that takes in everything but the id
    // because when we create a pet, we won't know the id (it will be generated automatically when we insert it)
    public Pet(String name, String species, String color, int age, int legs, String breed) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.legs = legs;
        this.breed = breed;
    }

    // this constructor takes in all parameters and assigns them to the object
    public Pet(int id, String name, String species, String color, int age, int legs, String breed) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.legs = legs;
        this.breed = breed;
    }


    // int says that we're returning an integer
    public int getId() {
        return this.id;
    }

    // void means we don't return anything
    // because we're just setting the id, we don't need to return any information/value
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    // this method just takes all of our attributes and prints them out
    // if we didn't have this method, we would print out the memory address, which is not very helpful
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                ", breed='" + breed + '\'' +
                '}';
    }
    
}
