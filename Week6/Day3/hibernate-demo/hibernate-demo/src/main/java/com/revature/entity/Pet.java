// package is used to group our entities together
package com.revature.entity;

// this pet class is going to be mapped to a table in our database:
public class Pet {

    // how do we access these variables outide of the class if they're private?
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

    public int getId() {
        return this.id;
    }

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
