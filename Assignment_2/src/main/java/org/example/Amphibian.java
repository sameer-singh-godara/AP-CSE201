package org.example;

public class Amphibian extends Animal{
    private String type;
    public Amphibian(String name, int id, String description, String feed) {
        super(name, id, description, feed);
        this.type = "Amphibian";
    }

    @Override
    public String getType() {
        return this.type;
    }
}
