package org.example;

public class Admin extends Visitor{
    private String username;

    public Admin(String password, String username) {
        super(username, 0,"0",0,"", password);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
