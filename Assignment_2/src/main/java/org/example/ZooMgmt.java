package org.example;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ZooMgmt{
    public static void main(String[] args) {
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
                    System.out.println("You have entered Sucessfully as "+ adminUsername);
                }
                else {
                    System.out.println("You have entered wrong username");
                }
            }
            else if (firstChoice == 2){
                System.out.println("1. Register");
                System.out.println("2. Login");
                int secondChoice = sc.nextInt();
                sc.nextLine();
                while(true){
                    if (secondChoice == 1){
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
                        zoo.registerVisitor(visitor);
                        System.out.println("Visitor is Successfully registered");
                        break;

                    }
                    else if (secondChoice == 2) {
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
                                System.out.println(emailVisitor);
                                System.out.println(visitor.getEmail());
                                System.out.println(passwordVisitor);
                                System.out.println(visitor.getPassword());
                                if (emailVisitor.equals(visitor.getEmail()) && passwordVisitor.equals(visitor.getPassword())){
                                    flag = 1;
                                    System.out.println("Hi " + visitor.getName() + ", you have Entered Successfully");

                                }

                            }
                            if (flag == 0){
                                System.out.println("Either Username or Password is Wrong");
                            }
                        }
                    }
                    else if (secondChoice == 3) {
                        System.out.println("back");
                    }
                    else {
                        break;
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