package org.example;

import org.w3c.dom.Attr;

import java.util.*;

public class ZooMgmt{
    public static void main(String[] args) {
        int attractionId = 1;
        int animalId = 1;
        int visitorId = 0;
        int feedbackId = 0;
        int revenue = 0;

        Zoo zoo = new Zoo();
        System.out.println("--------------");
        System.out.println("Welcome to Zoo");
        String username = "admin";
        String password = "admin123";


        while(true){
            System.out.println("--------------");
            System.out.println("1. Enter As Admin");
            System.out.println("2. Enter As Visitor");
            System.out.println("3. View Special Deals");
            Scanner sc = new Scanner(System.in);
            int firstChoice = sc.nextInt();
            sc.nextLine();
            if (firstChoice == 1){
                System.out.println("--------------");
                System.out.println("Enter Admin Username");
                String adminUsername = sc.nextLine();
                System.out.println("Enter Admin Password");
                String adminPassword = sc.nextLine();
                if (Objects.equals(adminUsername, username) && Objects.equals(adminPassword, password)){
                    System.out.println("You have entered Successfully as "+ adminUsername);
                    while (true){
                        System.out.println("--------------");
                        System.out.println("1. Manage Attraction");
                        System.out.println("2. Manage Animals");
                        System.out.println("3. Schedule Events");
                        System.out.println("4. Set Discounts");
                        System.out.println("5. Set Special Deals");
                        System.out.println("6. View Visitor Stats");
                        System.out.println("7. View Feedback");
                        System.out.println("8. Exit");
                        int secondChoiceA = sc.nextInt();
                        sc.nextLine();
                        if (secondChoiceA == 1){
                            System.out.println("--------------");
                            System.out.println("Manage Attractions");
                            System.out.println("1. Add Attraction");
                            System.out.println("2. Update Attraction");
                            System.out.println("3. Remove Attraction");
                            System.out.println("4. Exit");

                            int thirdChoiceA = sc.nextInt();
                            sc.nextLine();

                            if (thirdChoiceA == 1){
                                System.out.println("--------------");
                                System.out.println("Enter Attraction Name");
                                String nameAtt = sc.nextLine();
                                System.out.println("Enter Attraction Description");
                                String descriptionAtt = sc.nextLine();
                                System.out.println("Enter Attraction Price");
                                int priceAtt = sc.nextInt();
                                sc.nextLine();
                                Attraction attraction = new Attraction(nameAtt, descriptionAtt, attractionId, priceAtt, 0, 0);
                                zoo.addAttraction(attraction);
                                System.out.println("The Attraction is Registered Successfully with ID : " + attractionId);
                                attractionId++;

                            }
                            else if (thirdChoiceA == 2){
                                System.out.println("--------------");
                                System.out.println("1. Update Name");
                                System.out.println("2. Update Description");
                                System.out.println("3. Update Price");
                                System.out.println("4. Update Availability");
                                System.out.println("5. Exit");

                                int fourthChoiceA = sc.nextInt();
                                sc.nextLine();
                                if (fourthChoiceA == 1) {
                                    System.out.println("--------------");
                                    System.out.println("Enter Attraction ID");
                                    int idInput = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Enter New Attraction Name");
                                    String nameNewAtt = sc.nextLine();
                                    zoo.updateAttractionName(idInput, nameNewAtt);
                                }
                                else if (fourthChoiceA == 2) {
                                    System.out.println("--------------");
                                    System.out.println("Enter Attraction ID");
                                    int idInput = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Enter New Attraction Description");
                                    String descriptionNewAtt = sc.nextLine();
                                    zoo.updateAttractionDescription(idInput, descriptionNewAtt);
                                }
                                else if (fourthChoiceA == 3) {
                                    System.out.println("--------------");
                                    System.out.println("Enter Attraction ID");
                                    int idInput = sc.nextInt();
                                    System.out.println("Enter New Attraction Price");
                                    int priceNewAtt = sc.nextInt();
                                    sc.nextLine();
                                    zoo.updateAttractionPrice(idInput, priceNewAtt);
                                }
                                else if (fourthChoiceA == 4) {
                                    System.out.println("--------------");
                                    System.out.println("Enter Attraction ID");
                                    int idInput = sc.nextInt();
                                    System.out.println("Enter New Attraction Availability (write 1: for open and 0: for closed)");
                                    int openNewAtt = sc.nextInt();
                                    sc.nextLine();
                                    zoo.updateAttractionOpen(idInput, openNewAtt);
                                }
                                else if (fourthChoiceA == 5) {
                                    break;
                                }
                                else {
                                    System.out.println("Try Again Wrong Command");
                                }
                            }
                            else if (thirdChoiceA == 3){
                                System.out.println("--------------");
                                System.out.println("Enter Attraction ID");
                                int idInput = sc.nextInt();
                                sc.nextLine();
                                zoo.removeAttraction(idInput);
                            }
                            else if (thirdChoiceA == 4){
                                System.out.println("You have successfully gone to back menu");
                            }
                            else {
                                System.out.println("Wrong Command Try Again");
                            }
                        }
                        //////////
                        else if (secondChoiceA == 2) {
                            System.out.println("2");
                            System.out.println("--------------");
                            System.out.println("Manage Animals");
                            System.out.println("1. Add Animal");
                            System.out.println("2. Update Animal");
                            System.out.println("3. Remove Animal");
                            System.out.println("4. Exit");

                            int thirdChoiceA = sc.nextInt();
                            sc.nextLine();

                            if (thirdChoiceA == 1){
                                System.out.println("--------------");
                                System.out.println("Enter Animal Name");
                                String nameAnimal = sc.nextLine();
                                System.out.println("Enter Animal Description");
                                String descriptionAnimal = sc.nextLine();
                                System.out.println("Enter Animal Type");
                                String typeAnimal = sc.nextLine();
                                System.out.println("Enter Animal Sound");
                                String feedAnimal = sc.nextLine();
                                Animal animal = new Animal(nameAnimal, animalId, descriptionAnimal, feedAnimal, typeAnimal);
                                zoo.addAnimal(animal);
                                System.out.println("The Animal is Registered Successfully with ID : " + animalId);
                                animalId++;

                            }
                            else if (thirdChoiceA == 2){
                                System.out.println("--------------");
                                System.out.println("1. Update Name");
                                System.out.println("2. Update Description");
                                System.out.println("3. Update Sound");
                                System.out.println("4. Update Type");
                                System.out.println("5. Exit");

                                int fourthChoiceA = sc.nextInt();
                                sc.nextLine();
                                if (fourthChoiceA == 1) {
                                    System.out.println("--------------");
                                    System.out.println("Enter Animal ID");
                                    int idInput = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Enter New Animal Name");
                                    String nameNewAnimal = sc.nextLine();
                                    zoo.updateAnimalName(idInput, nameNewAnimal);
                                }
                                else if (fourthChoiceA == 2) {
                                    System.out.println("--------------");
                                    System.out.println("Enter Animal ID");
                                    int idInput = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Enter New Animal Description");
                                    String descriptionNewAnimal = sc.nextLine();
                                    zoo.updateAnimalDescription(idInput, descriptionNewAnimal);
                                }
                                else if (fourthChoiceA == 3) {
                                    System.out.println("--------------");
                                    System.out.println("Enter Animal ID");
                                    int idInput = sc.nextInt();
                                    System.out.println("Enter New Attraction Sound");
                                    String soundNewAnimal = sc.nextLine();
                                    sc.nextLine();
                                    zoo.updateAnimalSound(idInput, soundNewAnimal);
                                }
                                else if (fourthChoiceA == 4) {
                                    System.out.println("--------------");
                                    System.out.println("Enter Animal ID");
                                    int idInput = sc.nextInt();
                                    System.out.println("Enter New Animal Type");
                                    String typeNewAnimal = sc.nextLine();
                                    sc.nextLine();
                                    zoo.updateAnimalType(idInput, typeNewAnimal);
                                }
                                else if (fourthChoiceA == 5) {
                                    break;
                                }
                                else {
                                    System.out.println("Try Again Wrong Command");
                                }
                            }
                            else if (thirdChoiceA == 3){
                                System.out.println("--------------");
                                System.out.println("Enter Attraction ID");
                                int idInput = sc.nextInt();
                                sc.nextLine();
                                zoo.removeAttraction(idInput);
                            }
                            else if (thirdChoiceA == 4){
                                System.out.println("You have successfully gone to back menu");
                            }
                            else {
                                System.out.println("Wrong Command Try Again");
                            }

                        }
                        else if (secondChoiceA == 3) {
                            System.out.println("3");
                        }
                        else if (secondChoiceA == 4) {
                            System.out.println("4");
                        }
                        else if (secondChoiceA == 5) {
                            System.out.println("5");
                        }
                        else if (secondChoiceA == 6) {
                            System.out.println("Visitor Statistics");
                            System.out.println("1. Total number of Visitors : " + visitorId);
                            System.out.println("2. Total Revenue of Zoo : " + revenue);
                            /* finding attraction with maximum visitors */
                            int max = 0;
                            Attraction maxKey = null;
                            Map<Integer, Attraction> attractionHashMap = zoo.getAttractions();
                            for  (Map.Entry<Integer, Attraction> entry : attractionHashMap.entrySet()){

                                int val = (entry.getValue()).getNumberOfVisitors();
                                if (val>max){
                                    max = val;
                                    maxKey = entry.getValue();
                                }
                            }
                            if (maxKey!=null){
                                System.out.println("3. Most Popular Attraction : " + maxKey.getName());
                            }
                            else {
                                System.out.println("3. There Are No Attraction Hence No Popular Attraction");
                            }
                        }
                        else if (secondChoiceA == 7) {
                            System.out.println("Feedbacks of Visitors are as follows:");
                            Map<Integer, String> feedbacksHashMap = zoo.getFeedbacks();
                            String keyValue = null;
                            for  (Map.Entry<Integer, String> entry : feedbacksHashMap.entrySet()){
                                keyValue = entry.getValue();
                                if (keyValue!=null) {
                                    System.out.println("Feedback ID: " + entry.getKey() + " - Feedback: " + entry.getValue());
                                }
                            }
                            if (keyValue == null){
                                System.out.println("No Feedbacks Given by Visitor Yet");
                            }

                        }
                        else if (secondChoiceA == 8) {
                            System.out.println("8");
                            break;
                        }
                        else {
                            System.out.println("Error");

                        }

                    }
                }
                else {
                    System.out.println("You have entered wrong username");
                }
            }
            else if (firstChoice == 2){
                while(true){
                    System.out.println("--------------");
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.println("3. Exit");
                    int secondChoiceV = sc.nextInt();
                    sc.nextLine();
                    if (secondChoiceV == 1){
                        int flag = 0;
                        System.out.println("--------------");
                        System.out.println("Enter Visitor Name");
                        String name = sc.nextLine();
                        System.out.println("Enter Visitor Age");
                        int age = sc.nextInt();
                        String phoneNumber;

                        while (true){
                            System.out.println("Enter Visitor Phone Number");
                            phoneNumber = sc.next();
                            sc.nextLine();
                            if (zoo.isValidPhoneNumber(phoneNumber)){
                                flag = 0;
                                break;
                            }
                            else {
                                flag = 1;
                            }
                        }
                        System.out.println("Enter Visitor Balance");
                        int balance = sc.nextInt();
                        sc.nextLine();
                        String email;
                        while (true){
                            System.out.println("Enter Visitor Email ID");
                            email = sc.next();
                            if (zoo.isValidEmail(email)){
                                flag = 0;
                                break;
                            }
                            else {
                                flag = 1;
                            }
                        }
                        System.out.println("Enter Visitor Password");
                        String passwordVisitor = sc.next();
                        Visitor visitor = new Visitor(name, age, phoneNumber, balance, email, passwordVisitor, visitorId);
                        zoo.addVisitor(visitor);
                        System.out.println("Visitor is Successfully registered with ID : "+ visitorId);
                        visitorId++;

                    }
                    else if (secondChoiceV == 2) {
                        String usernameVisitor;
                        while (true){
                            System.out.println("Enter Visitor Email ID");
                            usernameVisitor = sc.next();
                            if (zoo.isValidEmail(usernameVisitor)){
                                break;
                            }
                        }
                        System.out.println("Enter Visitor Password");
                        String passwordVisitor = sc.next();
                        HashMap<Integer, Visitor> visitorHashMap = zoo.getVisitors();
                        Collection<Visitor> value1 = visitorHashMap.values();
                        ArrayList<Visitor> visitorsList = new ArrayList<>(value1);
                        if (visitorHashMap.isEmpty()){
                            System.out.println("Member Doesn't Exist Try Again First Enter Some Members");
                        }
                        else {
                            int flag = 0;
                            for (Visitor visitor : visitorsList){
                                if (usernameVisitor.equals(visitor.getUsername()) && passwordVisitor.equals(visitor.getPassword())){
                                    flag = 1;
                                    System.out.println("Hi " + visitor.getName() + ", You Have Logged In Successfully");
                                    while (true){
                                        System.out.println("--------------");
                                        System.out.println("1. Explore Zoo");
                                        System.out.println("2. Buy Membership");
                                        System.out.println("3. Buy Tickets");
                                        System.out.println("4. View Discounts");
                                        System.out.println("5. View Special Deals");
                                        System.out.println("6. Visit Animals");
                                        System.out.println("7. Visit Attraction");
                                        System.out.println("8. Leave Feedback");
                                        System.out.println("9. Recharge Balance");
                                        System.out.println("10. Exit");

                                        int thirdChoiceV = sc.nextInt();
                                        sc.nextLine();

                                        if (thirdChoiceV == 1){
                                            System.out.println("Explore Zoo");
                                            while (true){
                                                System.out.println("1. View Animals");
                                                System.out.println("2. View Attraction");
                                                System.out.println("3. Exit");
                                                int fourthChoiceV = sc.nextInt();
                                                sc.nextLine();
                                                if (fourthChoiceV == 1){
                                                    System.out.println("Animals in the Zoo are as follows:");
                                                    Animal maxKey = null;
                                                    Map<Integer, Animal> animalMap = zoo.getAnimals();
                                                    HashMap<Integer, Animal> animals = zoo.getAnimals();
                                                    for  (Map.Entry<Integer, Animal> entry : animalMap.entrySet()){
                                                        maxKey = entry.getValue();
                                                        if (maxKey!=null){
                                                            System.out.println(entry.getKey() + ". " + (entry.getValue()).getName());
                                                        }
                                                    }
                                                    if (maxKey!=null){
                                                        int fifthChoiceV = sc.nextInt();
                                                        System.out.println(animals.get(fifthChoiceV).getName() + ":");
                                                        System.out.println(animals.get(fifthChoiceV).getDescription());
                                                    }
                                                    else {
                                                        System.out.println("There are no Animals in the Zoo");
                                                    }
                                                }
                                                else if (fourthChoiceV == 2){
                                                    System.out.println("Attraction in the Zoo are as follows:");
                                                    Attraction maxKey = null;
                                                    Map<Integer, Attraction> attractionMap = zoo.getAttractions();
                                                    HashMap<Integer, Attraction> attractions = zoo.getAttractions();
                                                    for  (Map.Entry<Integer, Attraction> entry : attractionMap.entrySet()){
                                                        maxKey = entry.getValue();
                                                        if (maxKey!=null){
                                                            System.out.println(entry.getKey() + ". " + (entry.getValue()).getName());
                                                        }
                                                    }
                                                    if (maxKey!=null){
                                                        int fifthChoiceV = sc.nextInt();
                                                        System.out.println(attractions.get(fifthChoiceV).getName() + ":");
                                                        System.out.println(attractions.get(fifthChoiceV).getDescription());
                                                    }
                                                    else {
                                                        System.out.println("There are no Attraction in the Zoo");
                                                    }
                                                }
                                                else if (fourthChoiceV == 3){
                                                    break;
                                                }
                                                else {
                                                    System.out.println("Wrong Command Try Again");
                                                }
                                            }
                                        }
                                        else if (thirdChoiceV == 2) {
                                            while (true) {
                                                if (visitor.getMembership() == 0) {
                                                    System.out.println("Buy Membership:");
                                                    System.out.println("1. Basic Membership (₹20)");
                                                    System.out.println("2. Premium Membership (₹50)");
                                                    System.out.println("3. Exit");
                                                    int fourthChoiceV = sc.nextInt();
                                                    sc.nextLine();
                                                    if (fourthChoiceV == 1) {
                                                        if (visitor.getBalance()>=20){
                                                            visitor.setMembership(1);
                                                            int balanceV = visitor.getBalance();
                                                            visitor.setBalance(balanceV - 20);
                                                            System.out.println("You have Successfully Purchased Basic Membership");
                                                            System.out.println("Your balance is: " + visitor.getBalance());
                                                            break;
                                                        }
                                                        else {
                                                            System.out.println("Low Balance Recharge Your Balance");
                                                            System.out.println("Your balance is: " + visitor.getBalance());
                                                            break;
                                                        }
                                                    }
                                                    else if (fourthChoiceV == 2) {
                                                        if (visitor.getBalance()>=50){
                                                            visitor.setMembership(2);
                                                            int balanceV = visitor.getBalance();
                                                            visitor.setBalance(balanceV - 50);
                                                            System.out.println("You have Successfully Purchased Premium Membership");
                                                            System.out.println("Your balance is: " + visitor.getBalance());
                                                            break;
                                                        }
                                                        else {
                                                            System.out.println("Low Balance Recharge Your Balance");
                                                            System.out.println("Your balance is: " + visitor.getBalance());
                                                            break;
                                                        }
                                                    }
                                                    else if (fourthChoiceV == 3){
                                                        break;
                                                    }
                                                    else {
                                                        System.out.println("Wrong Command Try Again");
                                                    }
                                                }
                                                else if (visitor.getMembership() == 1) {
                                                    System.out.println("Upgrade Membership, you currently have Basic Membership:");
                                                    System.out.println("1. Premium Membership (₹30) (Only the difference between both membership is to be paid)");
                                                    System.out.println("2. Exit");
                                                    int fourthChoiceV = sc.nextInt();
                                                    sc.nextLine();
                                                    if (fourthChoiceV == 1) {
                                                        if (visitor.getBalance()>=30){
                                                            visitor.setMembership(2);
                                                            int balanceV = visitor.getBalance();
                                                            visitor.setBalance(balanceV - 30);
                                                            System.out.println("You have Successfully Upgraded to Premium Membership");
                                                            System.out.println("Your balance is: " + visitor.getBalance());
                                                            break;
                                                        }
                                                        else {
                                                            System.out.println("Low Balance Recharge Your Balance");
                                                            System.out.println("Your balance is: " + visitor.getBalance());
                                                            break;
                                                        }
                                                    }
                                                    else if (fourthChoiceV == 2) {
                                                        break;
                                                    }
                                                    else {
                                                        System.out.println("Wrong Command Try Again");
                                                    }
                                                }
                                                else if (visitor.getMembership() == 2) {
                                                    System.out.println("You Already have Premium Membership");
                                                    break;
                                                }
                                            }
                                        }
                                        else if (thirdChoiceV == 3) {
                                            System.out.println("Buy Tickets");
                                            System.out.println("Enter the number of tickets");
                                            int numberTicket = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Select the Attraction You Want to Buy (Price will be multiplied by Number of tickets)");
                                            Attraction maxKey = null;
                                            Map<Integer, Attraction> attractionMap = zoo.getAttractions();
                                            HashMap<Integer, Attraction> attractions = zoo.getAttractions();
                                            for  (Map.Entry<Integer, Attraction> entry : attractionMap.entrySet()){
                                                maxKey = entry.getValue();
                                                if (maxKey!=null && maxKey.isOpen() == 1){
                                                    System.out.println(entry.getKey() + ". " + (entry.getValue()).getName() + " - ( ₹" + (entry.getValue()).getPrice() + ")");
                                                }
                                            }
                                            if (maxKey!=null && maxKey.isOpen() == 1){
                                                int fourthChoiceV = sc.nextInt();
                                                sc.nextLine();
                                                if (visitor.getBalance() >= ((attractions.get(fourthChoiceV)).getPrice()) * numberTicket){
                                                    for (int i = 0; i < numberTicket; i++){
                                                        visitor.addAttractionsPurchased(attractions.get(fourthChoiceV));
                                                    }
                                                    int balanceV = visitor.getBalance();
                                                    visitor.setBalance(balanceV - (((attractions.get(fourthChoiceV)).getPrice()) * numberTicket)) ;
                                                    System.out.println("You have Successfully Purchased " + numberTicket + " Tickets of " + (attractions.get(fourthChoiceV)).getName());
                                                    System.out.println("Your balance is: " + visitor.getBalance());
                                                }
                                                else {
                                                    System.out.println("Low balance Recharge First");
                                                    System.out.println("Your balance is: " + visitor.getBalance());
                                                }
                                            }
                                            else {
                                                System.out.println("There are no Attraction in the Zoo or All Attractions are Closed Wait it to be Scheduled");
                                            }

                                        }
                                        else if (thirdChoiceV == 4) {
                                            System.out.println("4");
                                        }
                                        else if (thirdChoiceV == 5) {
                                            System.out.println("5");
                                        }
                                        else if (thirdChoiceV == 6) {
                                            System.out.println("6");
                                        }
                                        else if (thirdChoiceV == 7) {
                                            System.out.println("7");
                                        }
                                        else if (thirdChoiceV == 8) {
                                            System.out.println("Enter Your Feedback");
                                            String feedback = sc.nextLine();
                                            zoo.addFeedback(feedbackId, feedback);
                                            System.out.println("Your Feedback is Added with ID : " + feedbackId);
                                            feedbackId++;
                                        }
                                        else if (thirdChoiceV == 9) {
                                            System.out.println("Recharge Your Balance:");
                                            System.out.println("Your Current Balance is : " + visitor.getBalance());
                                            System.out.println("Enter the Amount");
                                            int recharge = sc.nextInt();
                                            sc.nextLine();
                                            recharge += visitor.getBalance();
                                            visitor.setBalance(recharge);
                                        }
                                        else if (thirdChoiceV == 10) {
                                            System.out.println("Exited Successfully");
                                            break;
                                        }
                                        else {
                                            System.out.println("Wrong Command Try Again");
                                        }
                                    }
                                }
                            }
                            if (flag == 0){
                                System.out.println("Either Username or Password is Wrong");
                            }
                        }
                    }
                    else if (secondChoiceV == 3) {
//                        System.out.println("back");
                        break;
                    }
                    else {
                        System.out.println("Entered Wrong Command Try Again");
                    }
                }

            }
            else if (firstChoice == 3){
                System.out.println("The Special Deals are as follows:");

            }
            else {
                System.out.println("Thanks for Visiting");
                break;
            }

        }
    }

}