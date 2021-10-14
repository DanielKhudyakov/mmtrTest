package com.company;

import java.util.ArrayList;
import java.util.Collections;

class MyException extends Exception{
    public MyException (String Message){

        super(Message);
    }
}

public class UserRepository  {
    public   ArrayList<User> repository;
    public  UserRepository(){
        repository = new ArrayList<User>();
    }
    public void addUser(User user) throws MyException
    {
        if(repository.size()!=0)
        {
            for (int i = 0; i< repository.size(); i++)
            {
                if(repository.get(i).getUserID()==user.getUserID())
                {
                    throw new MyException("Пользователь с UserID="+ repository.get(i).getUserID()+" уже существует.");
                }
            }
        }
        repository.add(user);
    }
    public User getUser(int id)
    {
        if (repository.size() > 0)
        {
            for (int i = 0; i < repository.size(); i++)
            {
                if (repository.get(i).getUserID() == id)
                {
                    return repository.get(i);
                }
            }
        }
        return null;
    }
    public ArrayList<User> getOrderedUsers()
    {
        ArrayList<User> userArrayList=new ArrayList<User>();
        ArrayList<Integer> integerArrayList=new ArrayList<Integer>();
        if(repository.size()==0) {return null;}

        for (int i = 0; i< repository.size(); i++)
        {
            integerArrayList.add(repository.get(i).getUserID());
        }
        Collections.sort(integerArrayList);
        for (int j=0;j<integerArrayList.size();j++)
        {
            userArrayList.add(getUser(integerArrayList.get(j)));
        }
            return userArrayList;
    }

}
