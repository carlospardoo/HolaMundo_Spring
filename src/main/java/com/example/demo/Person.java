package com.example.demo;

public class Person{
    private String name;
    private String lastname;
    private String kindPerson;

    public Person(){

    }

    public String getName(){
        return this.name;
    }
    
    public String getLastname(){
        return this.lastname;
    }

    public String getKindPerson(){
        return this.kindPerson;
    }

    public void setName(String name){
        this.name = name;
    }
}