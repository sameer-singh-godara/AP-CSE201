package org.example;

public class Reptile extends Animal{
    private String type;

    public Reptile(String name, int id, String description, String feed) {
        super(name, id, description, feed);
        this.type = "Reptile";
    }

    @Override
    public String getType() {
        return this.type;
    }
}
