package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animals;
    private final List<Visitor> visitors;

    public Zoo() {
        animals = new ArrayList<>();
        visitors = new ArrayList<>();
    }


// Other fields, constructor, and methods


    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Visitor> getVisitors() {
        return visitors;
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void registerVisitor(Visitor visitor) {
        visitors.add(visitor);
    }


    public boolean isValidPhoneNumber(String phoneNumber) {
        // Define a regular expression for a valid phone number format.
        String regex = "^[0-9]{10}$"; // For a 10-digit phone number

        if (phoneNumber.matches(regex)) {
            return true;
        }
        else {
            System.out.println("InValid Phone Number Try Again");
            return false;
        }
    }

    public boolean isValidEmail(String email) {
        // Define a regular expression for a valid email address format.
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        if (email.matches(regex)) {
            return true;
        }
        System.out.println("InValid Email ID Try Again");
        return false;
    }
}
