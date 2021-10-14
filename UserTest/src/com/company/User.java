package com.company;

public class User {
    private int UserID ;
    private String Name;
    public User(int Id,String Name){
        this.UserID =Id;
        this.Name=Name;
    }
    public int getUserID(){
        return UserID;
    }
    public String getName(){
        return  Name;
    }
}
