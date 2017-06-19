package com.yello.trainingapplication;

/**
 * Created by User on 2017-06-17.
 */
public class Workout {
    private String name;
    private String description;

    public static  final Workout workArray [] ={
            new Workout("Trening1", "Pompki,\n Pompki"),
            new Workout("Trening2","Brzuszki, \n Brzuszki"),
            new Workout("Trening3","Przysiady, \n Przysiady")
    };



    public Workout(String n, String d){
        this.name = n;
        this.description =d;

    }




    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}
