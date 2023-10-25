package org.example;

public class Mammal extends Animal{
    private String type;

    public Mammal(String name, int id, String description, String feed) {
        super(name, id, description, feed);
        this.type = "Mammal";
    }

    @Override
    public String getType() {
        return this.type;
    }
}
