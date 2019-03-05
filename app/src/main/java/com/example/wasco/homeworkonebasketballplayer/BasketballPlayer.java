package com.example.wasco.homeworkonebasketballplayer;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class BasketballPlayer implements Serializable
{//Fields needed to define our basketball player for the team
    public String Firstname;
    public String Lastname;
    public int jerseynumber;
    public int age;
    public int heightInches;
    public int heightFeet;

    public BasketballPlayer(String Firstname, String Lastname, int jerseynumber, int age, int heightInches, int heightFeet)
    {//this is our constructor
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.jerseynumber = jerseynumber;
        this.age = age;
        this.heightInches = heightInches;
        this.heightFeet = heightFeet;

    }

    public void display()
    {
        System.out.println(this.Firstname + " " + this.Lastname + " " + this.jerseynumber + " " + this.age
                + " " + this.heightInches + " ( " + this.heightFeet + " )");



    }

    public String Basket()
    {
        return (this.Firstname + " " + this.Lastname + " " + this.jerseynumber + " " + this.age
                + " " + this.heightInches + " ( " + this.heightFeet + " )");
    }
    // these are getters

    public int getAge()
    {
        return age;
    }

    public String getFirstname()
    {
        return Firstname;
    }

    public String getLastname()
    {
        return Lastname;
    }

    public int getJerseynumber()
    {
        return jerseynumber;
    }

    public int getHeightInches()
    {
        return heightInches;
    }

    public int getHeightFeet()
    {
        return heightFeet;
    }
    //theses are setters
@Exclude
    public void setJerseynumber(int jerseynumber)
    {
        if (jerseynumber >= 0)
        {
            this.jerseynumber = jerseynumber;
        }
    }
@Exclude
    public void setAge(int age)
    {
        if(age >= 6)
        {
            this.age = age;
        }
    }
@Exclude
    public void setHeightInches(int heightInches)
    {
        if(heightInches >= 4)
        {
            this.heightInches = heightInches;
        }
    }
@Exclude
    public void setHeightFeet(int heightFeet)
    {
        if(heightFeet >= 0)
        {
            this.heightFeet = heightFeet;
        }
    }

}
