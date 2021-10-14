package com.company;

public class User {
    private int userID;
    private String name;
    public User(int id,String name){
        this.userID =id;
        this.name =name;
    }
    public int getUserID(){
        return userID;
    }
    public String getName(){
        return name;
    }
}
