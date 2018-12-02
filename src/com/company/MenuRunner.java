package com.company;

public class MenuRunner {
    public static void main(String[]args){
        Sandwich Reuben = new Sandwich("Reuben",5.75);
        Sandwich bec = new Sandwich ("BEC",2.00);
        Salad Waldorf = new Salad ("Waldorf",4.50);
        Salad Caeser = new Salad("Caeser",4.5);
        Drink icedTea = new Drink("Iced Tea",1.50);
        Drink Smoothie = new Drink ("Smoothie",5.50);

        Trio trio1 = new Trio (Reuben,Waldorf,icedTea);
        Trio trio2 = new Trio (Reuben,Caeser,Smoothie);
        Trio trio3 = new Trio (bec,Caeser,icedTea);

        System.out.println(trio1.getName() + "Price " +trio1.getPrice());
        System.out.println(trio2.getName() + "Price " +trio2.getPrice());
        System.out.println(trio3.getName() + "Price " +trio3.getPrice());

    }
}
