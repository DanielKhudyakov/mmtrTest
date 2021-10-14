package com.company;

import java.util.ArrayList;
import java.util.Collections;

class MyException extends Exception{
    public MyException (String Message){

        super(Message);
    }
}

public class UserRepository  {
    public   ArrayList<User> Repository;
    public  UserRepository(){
        Repository = new ArrayList<User>();
    }
    public void AddUser(User user) throws MyException
    {
        if(Repository.size()!=0)
        {
            for (int i = 0; i< Repository.size(); i++)
            {
                if(Repository.get(i).getUserID()==user.getUserID())
                {
                    throw new MyException("Пользователь с UserID="+ Repository.get(i).getUserID()+" уже существует.");
                }
            }
        }
        Repository.add(user);
    }
    public User  GetUser(int id)
    {
        if (Repository.size() > 0)
        {
            for (int i = 0; i < Repository.size(); i++)
            {
                if (Repository.get(i).getUserID() == id)
                {
                    return Repository.get(i);
                }
            }
        }
        return null;
    }
    public ArrayList<User>  GetOrderedUsers()
    {
        ArrayList<User> userArrayList=new ArrayList<User>();
        ArrayList<Integer> integerArrayList=new ArrayList<Integer>();
        if(Repository.size()==0) {return null;}

        for (int i = 0; i< Repository.size(); i++)
        {
            integerArrayList.add(Repository.get(i).getUserID());
        }
        Collections.sort(integerArrayList);
        for (int j=0;j<integerArrayList.size();j++)
        {
            userArrayList.add(GetUser(integerArrayList.get(j)));
        }
            return userArrayList;
    }

}
