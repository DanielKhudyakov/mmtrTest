package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            UserRepository n=new UserRepository();
            User User0=new User(12,"Ivan");
            User User1=new User(1,"Dima");
            User User2=new User(10,"Micha");
            User User3=new User(120,"Kolja");
            User User4=new User(12,"Max");
            n.AddUser(User0);
            n.AddUser(User1);
            n.AddUser(User2);
            n.AddUser(User3);
            n.AddUser(User4);
            ArrayList<User> g=n.GetOrderedUsers();
            System.out.println(g.size());
            for (int i=0;i<5;i++){
               System.out.println(g.get(i).getUserID());
               System.out.println(g.get(i).getName()) ;
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
