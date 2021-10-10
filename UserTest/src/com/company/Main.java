package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            UserRepository n=new UserRepository();
            User u0=new User(12,"Ivan");
            User u1=new User(1,"Dima");
            User u2=new User(10,"Micha");
            User u3=new User(120,"Kolja");
            User u4=new User(12,"Max");
            n.AddUser(u0);
            n.AddUser(u1);
            n.AddUser(u2);
            n.AddUser(u3);
            n.AddUser(u4);
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
