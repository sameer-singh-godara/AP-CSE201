package org.example;

public class Animal implements Events{
    private String name;
    private int id;
    private String description;
    private String feed;
    private String type;

    public Animal(String name, int id, String description, String feed, String type) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.feed = feed;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void description() {
        System.out.println(this.description);
    }

    @Override
    public int id() {
        return this.id;
    }

    @Override
    public void name() {
        System.out.println(this.name);
    }
}