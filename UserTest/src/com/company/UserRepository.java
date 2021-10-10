package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class MyException extends Exception{
    public MyException (String message){

        super(message);
    }
}

public class UserRepository  {
    private Object mutex = new Object();
    public   ArrayList<User> repository ;
    public  UserRepository(){
        repository= new ArrayList<User>();
    }
    public void AddUser(User user) throws MyException
    {
        if(repository.size()!=0)
        {
            for (int i=0;i<repository.size();i++)
            {
                if(repository.get(i).getUserID()==user.getUserID())
                {
                    throw new MyException("Пользователь с UserID="+repository.get(i).getUserID()+" уже существует.");
                }
            }
        }
        repository.add(user);
    }
    public User  GetUser(int id)
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
    public ArrayList<User>  GetOrderedUsers()
    {
        ArrayList<User> arr=new ArrayList<User>();
        ArrayList<Integer> newRep=new ArrayList<Integer>();
        if(repository.size()==0) {return null;}

        for (int i=0;i<repository.size();i++)
        {
            newRep.add(repository.get(i).getUserID());
        }
        Collections.sort(newRep);
        for (int j=0;j<newRep.size();j++)
        {
            arr.add(GetUser(newRep.get(j)));
        }
            return arr;
    }

}
