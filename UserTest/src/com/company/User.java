package com.company;

public class User {
    private int UserID ;
    private String Name;
    public User(int id,String name){
        this.UserID =id;
        this.Name=name;
    }
    public int getUserID(){
        return UserID;
    }
    public String getName(){
        return  Name;
    }
}
