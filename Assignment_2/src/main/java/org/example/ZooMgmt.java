package org.example;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ZooMgmt{
    public static void main(String[] args) {
        int attractionId = 1;
        int animalId = 1;
        Zoo zoo = new Zoo();
        System.out.println("Welcome to Zoo");
        System.out.println("--------------");
        String username = "admin";
        String password = "admin123";




        while(true){
            System.out.println("1. Enter As Admin");
            System.out.println("2. Enter As Visitor");
            System.out.println("3. View Special Deals");
            Scanner sc = new Scanner(System.in);
            int firstChoice = sc.nextInt();
            sc.nextLine();
            if (firstChoice == 1){
                System.out.println("Enter Admin Username");
                String adminUsername = sc.nextLine();
                System.out.println("Enter Admin Password");
                String adminPassword = sc.nextLine();
                if (Objects.equals(adminUsername, username) && Objects.equals(adminPassword, password)){
                    System.out.println("You have entered Successfully as "+ adminUsername);
                    while (true){
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
                            System.out.println("Manage Attractions");
                            System.out.println("1. Add Attraction");
                            System.out.println("2. Update Attraction");
                            System.out.println("3. Remove Attraction");
                            System.out.println("4. Exit");

                            int thirdChoiceA = sc.nextInt();
                            sc.nextLine();

                            if (thirdChoiceA == 1){
                                System.out.println("Enter Attraction Name");
                                String nameAtt = sc.nextLine();
                                System.out.println("Enter Attraction Description");
                                String descriptionAtt = sc.nextLine();
                                System.out.println("Enter Attraction Price");
                                int priceAtt = sc.nextInt();
                                sc.nextLine();
                                Attraction attraction = new Attraction(nameAtt, descriptionAtt, attractionId, priceAtt, 0, 0);
                                attractionId++;
                                zoo.addAttraction(attraction);

                            }
                            else if (thirdChoiceA == 2){
                                System.out.println("1. Update Name");
                                System.out.println("2. Update Description");
                                System.out.println("3. Update Price");
                                System.out.println("4. Update Availability");
                                System.out.println("5. Exit");

                                int fourthChoiceA = sc.nextInt();
                                sc.nextLine();
                                if (fourthChoiceA == 1) {
                                    System.out.println("Enter Attraction ID");
                                    int idInput = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Enter New Attraction Name");
                                    String nameNewAtt = sc.nextLine();
                                    zoo.updateAttractionName(idInput, nameNewAtt);
                                }
                                else if (fourthChoiceA == 2) {
                                    System.out.println("Enter Attraction ID");
                                    int idInput = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Enter New Attraction Description");
                                    String descriptionNewAtt = sc.nextLine();
                                    zoo.updateAttractionDescription(idInput, descriptionNewAtt);
                                }
                                else if (fourthChoiceA == 3) {
                                    System.out.println("Enter Attraction ID");
                                    int idInput = sc.nextInt();
                                    System.out.println("Enter New Attraction Price");
                                    int priceNewAtt = sc.nextInt();
                                    sc.nextLine();
                                    zoo.updateAttractionPrice(idInput, priceNewAtt);
                                }
                                else if (fourthChoiceA == 4) {
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



                        }
                        else if (secondChoiceA == 2) {
                            System.out.println("2");

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
                            System.out.println("6");
                        }
                        else if (secondChoiceA == 7) {
                            System.out.println("7");
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
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.println("3. Exit");
                    int secondChoiceV = sc.nextInt();
                    sc.nextLine();
                    if (secondChoiceV == 1){
                        int flag = 0;
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
                        Visitor visitor = new Visitor(name, age, phoneNumber, balance, email, passwordVisitor);
                        zoo.addVisitor(visitor);
                        System.out.println("Visitor is Successfully registered");
//                        break;
                    }
                    else if (secondChoiceV == 2) {
                        String emailVisitor;
                        while (true){
                            System.out.println("Enter Visitor Email ID");
                            emailVisitor = sc.next();
                            if (zoo.isValidEmail(emailVisitor)){
                                break;
                            }
                        }
                        System.out.println("Enter Visitor Password");
                        String passwordVisitor = sc.next();
                        List<Visitor> visitors = zoo.getVisitors();
                        if (visitors.isEmpty()){
                            System.out.println("Member Doesn't Exist Try Again First Enter Some Members");
                        }
                        else {
                            int flag = 0;
                            for (Visitor visitor : visitors){
//                                System.out.println(emailVisitor);
//                                System.out.println(visitor.getEmail());
//                                System.out.println(passwordVisitor);
//                                System.out.println(visitor.getPassword());
                                if (emailVisitor.equals(visitor.getEmail()) && passwordVisitor.equals(visitor.getPassword())){
                                    flag = 1;
                                    System.out.println("Hi " + visitor.getName() + ", You Have Logged In Successfully");
                                    while (true){
                                        System.out.println("1. Explore Zoo");
                                        System.out.println("2. Buy Membership");
                                        System.out.println("3. Buy Tickets");
                                        System.out.println("4. View Discounts");
                                        System.out.println("5. View Special Deals");
                                        System.out.println("6. Visit Animals");
                                        System.out.println("7. Visit Attraction");
                                        System.out.println("8. Leave Feedback");
                                        System.out.println("9. Exit");

                                        int thirdChoiceV = sc.nextInt();
                                        sc.nextLine();

                                        if (thirdChoiceV == 1){
                                            System.out.println("Explore Zoo");
                                        }
                                        else if (thirdChoiceV == 2) {
                                            System.out.println("2");
                                        }
                                        else if (thirdChoiceV == 3) {
                                            System.out.println("3");
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
                                            System.out.println("8");
                                        }
                                        else if (thirdChoiceV == 9) {
                                            System.out.println("Exited Successfully");
                                            break;
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