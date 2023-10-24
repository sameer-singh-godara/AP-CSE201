package org.example;

import java.util.HashMap;


public class Zoo{
    private final HashMap<Integer, Animal> animals;
    private final HashMap<Integer, Attraction> attractions;
    private final HashMap<Integer, Visitor> visitors;
    private final HashMap<Integer, String> feedbacks;

    public Zoo() {
        animals = new HashMap<>();
        visitors = new HashMap<>();
        feedbacks = new HashMap<>();
        attractions = new HashMap<>();
    }


    public HashMap<Integer, Animal> getAnimals() {
        return animals;
    }

    public HashMap<Integer, Attraction> getAttractions() {
        return attractions;
    }

    public HashMap<Integer, Visitor> getVisitors() {
        return visitors;
    }

    public HashMap<Integer, String> getFeedbacks() {
        return feedbacks;
    }

    public void addVisitor(Visitor visitor) {
        visitors.put(visitor.getId(), visitor);
    }

    public void addFeedback(Integer feedbackId, String abc) {
        feedbacks.put(feedbackId, abc);
    }

    public void addAttraction(Attraction attraction) {
        attractions.put(attraction.getId(), attraction);
    }

    public void addAnimal(Animal animal) {
        animals.put(animal.getId(), animal);
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

    public void updateAttractionName(int idInput, String nameNewAtt) {

        if (!attractions.containsKey(idInput)){
            System.out.println("Error in Updating Name as ID Doesn't Exist");
            return;
        }
        Attraction attraction = attractions.get(idInput);

        if (attraction.getId() == idInput){
            attraction.setName(nameNewAtt);
            System.out.println("Name of Attraction has been updated to " + nameNewAtt);
        }
    }
        public void updateAttractionDescription(int idInput, String descriptionNewAtt) {
            if (!attractions.containsKey(idInput)){
                System.out.println("Error in Updating Name as ID Doesn't Exist");
                return;
            }
            Attraction attraction = attractions.get(idInput);

            if (attraction.getId() == idInput){
                attraction.setDescription(descriptionNewAtt);
                System.out.println("Description of Attraction has been updated to " + descriptionNewAtt);
            }
        }
        public void updateAttractionPrice(int idInput, int priceNewAtt) {
            if (!attractions.containsKey(idInput)){
                System.out.println("Error in Updating Name as ID Doesn't Exist");
                return;
            }
            Attraction attraction = attractions.get(idInput);

            if (attraction.getId() == idInput){
                attraction.setPrice(priceNewAtt);
                System.out.println("Price of Attraction has been updated to " + priceNewAtt);
            }
        }
        public void updateAttractionOpen(int idInput, int openNewAtt) {
            if (!attractions.containsKey(idInput)){
                System.out.println("Error in Updating Name as ID Doesn't Exist");
                return;
            }
            Attraction attraction = attractions.get(idInput);

            if (attraction.getId() == idInput){
                attraction.setAvailability(openNewAtt);
                if (openNewAtt == 1){
                System.out.println("Availability of Attraction has been updated to open : " + openNewAtt);
                }
                else {
                    System.out.println("Availability of Attraction has been updated to closed : " + openNewAtt);
                }
            }

        }

    public void removeAttraction(int idInput) {
        if (attractions.containsKey(idInput)){
            attractions.remove(idInput);
            System.out.println("Attraction with ID " + idInput + " has been removed");
        }
        else {
            System.out.println("Attraction can't be removed as ID " + idInput + " Doesn't Exist");
        }
    }


    public void updateAnimalName(int idInput, String nameNewAnimal) {

        if (!animals.containsKey(idInput)) {
            System.out.println("Error in Updating Name as ID Doesn't Exist");
            return;
        }
        Animal animal = animals.get(idInput);

        if (animal.getId() == idInput) {
            animal.setName(nameNewAnimal);
            System.out.println("Name of Animal has been updated to " + nameNewAnimal);
        }
    }
    public void updateAnimalDescription(int idInput, String descriptionNewAnimal) {

        if (!animals.containsKey(idInput)) {
            System.out.println("Error in Updating Name as ID Doesn't Exist");
            return;
        }
        Animal animal = animals.get(idInput);

        if (animal.getId() == idInput) {
            animal.setDescription(descriptionNewAnimal);
            System.out.println("Description of Animal has been updated to " + descriptionNewAnimal);
        }
    }
    public void updateAnimalSound(int idInput, String feedNewAnimal) {

        if (!animals.containsKey(idInput)) {
            System.out.println("Error in Updating Name as ID Doesn't Exist");
            return;
        }
        Animal animal = animals.get(idInput);

        if (animal.getId() == idInput) {
            animal.setFeed(feedNewAnimal);
            System.out.println("Sound of Animal has been updated to " + feedNewAnimal);
        }
    }
    public void updateAnimalType(int idInput, String typeNewAnimal) {

        if (!animals.containsKey(idInput)) {
            System.out.println("Error in Updating Name as ID Doesn't Exist");
            return;
        }
        Animal animal = animals.get(idInput);

        if (animal.getId() == idInput) {
            animal.setType(typeNewAnimal);
            System.out.println("Type of Animal has been updated to " + typeNewAnimal);
        }
    }
}
