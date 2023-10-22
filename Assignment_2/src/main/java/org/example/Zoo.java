package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals;
    private final List<Attraction> attractions;
    private final List<Visitor> visitors;
    private final List<String> feedbacks;

    public Zoo() {
        animals = new ArrayList<>();
        visitors = new ArrayList<>();
        feedbacks = new ArrayList<>();
        attractions = new ArrayList<>();
    }


// Other fields, constructor, and methods


    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Visitor> getVisitors() {
        return visitors;
    }
    public List<String> getFeedbacks() {
        return feedbacks;
    }
    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void addFeedback(String abc) {
        feedbacks.add(abc);
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
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
        int flag = 0;
        for (Attraction attraction : attractions){
            if (attraction.getId() == idInput){
                attraction.setName(nameNewAtt);
                System.out.println("Name of Attraction has been updated to " + nameNewAtt);
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("Error in Updating Name as ID Doesn't Exist");
        }

    }
        public void updateAttractionDescription(int idInput, String descriptionNewAtt) {
            int flag = 0;
            for (Attraction attraction : attractions){
                if (attraction.getId() == idInput){
                    attraction.setDescription(descriptionNewAtt);
                    System.out.println("Description of Attraction has been updated to: " + descriptionNewAtt);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println("Error in Updating Description as ID Doesn't Exist");
            }

        }
        public void updateAttractionPrice(int idInput, int priceNewAtt) {
            int flag = 0;
            for (Attraction attraction : attractions){
                if (attraction.getId() == idInput){
                    attraction.setPrice(priceNewAtt);
                    System.out.println("Price of Attraction has been updated to " + priceNewAtt);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println("Error in Updating Price as ID Doesn't Exist");
            }

        }
        public void updateAttractionOpen(int idInput, int openNewAtt) {
            int flag = 0;
            for (Attraction attraction : attractions){
                if (attraction.getId() == idInput){
                    attraction.setAvailability(openNewAtt);
                    if (openNewAtt == 1){
                        System.out.println("Availability of Attraction has been updated to Open" + attraction.isOpen());
                    }
                    else {
                        System.out.println("Availability of Attraction has been updated to Closed" + attraction.isOpen());
                    }
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println("Error in Updating Availability as ID Doesn't Exist");
            }

        }
}
