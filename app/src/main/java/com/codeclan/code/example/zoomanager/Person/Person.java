package com.codeclan.code.example.zoomanager.Person;

import com.codeclan.code.example.zoomanager.AnimalBuilder.MammalOrders.Perrissodactyla;

/**
 * Created by user on 30/05/2017.
 */

public class Person {
    String name;
    int age;
    double wallet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //overloading
    public Person(String name, int age, double money){
        this.name = name;
        this.age = age;
        setWallet(money);
    }

    private void setWallet(double money){
        this.wallet = money;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void addToWallet(double money){
        this.wallet += money;
    }

    public void takeFromWallet(double money){
        this.wallet -= money;
    }

}
