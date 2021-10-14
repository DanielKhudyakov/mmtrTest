package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            UserRepository n=new UserRepository();
            User user0=new User(12,"Ivan");
            User user1=new User(1,"Dima");
            User user2=new User(10,"Micha");
            User user3=new User(120,"Kolja");
            User user4=new User(12,"Max");
            n.addUser(user0);
            n.addUser(user1);
            n.addUser(user2);
            n.addUser(user3);
            n.addUser(user4);
            ArrayList<User> users=n.getOrderedUsers();
            System.out.println(users.size());
            for (int i=0;i<5;i++){
               System.out.println(users.get(i).getUserID());
               System.out.println(users.get(i).getName()) ;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
