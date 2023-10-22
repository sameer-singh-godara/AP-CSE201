package org.example;

public class Attraction implements Events{

    private String name;
    private String description;
    private int id;
    private int price;
    private int availability;
    private int numberOfVisitors;

    public Attraction(String name, String description, int id, int price, int availability, int numberOfVisitors) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.price = price;
        this.availability = availability;
        this.numberOfVisitors = numberOfVisitors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int isOpen() {
        return availability;
    }

    public void setAvailability(int open) {
        availability = open;
    }

    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    public void setNumberOfVisitors(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
    }

    @Override
    public void description() {
        System.out.println(this.description);
    }

    @Override
    public int id() {
        return 0;
    }

    @Override
    public void name() {
        System.out.println(this.name);
    }
}
