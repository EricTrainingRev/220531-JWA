package com.revature;

import com.revature.entity.Pet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Pet pet = new Pet(1, "Ashes", "Cat", "grey", 10, 4, "Maine Coone");
        System.out.println(pet.toString());
    }
}
