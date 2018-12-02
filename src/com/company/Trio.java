package com.company;

public class Trio implements MenuItem{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich,Salad salad,Drink drink){
        this.sandwich= sandwich;
        this.salad= salad;
        this.drink= drink;
    }
    public String getName(){
        String name= sandwich.getName();
        return name;
    }
    public double getPrice(){
        double p=0;
        double s= sandwich.getPrice();
        double s2= salad.getPrice();
        double d= drink.getPrice();
        if (s>d && s2>d) {
            p = s + s2;
        }
        if (s2>s && d>s) {
            p = s2 + d;
        }
        else {
            p = s + d;
        }
        return p;
        //p = price
        //s = sandwich
        //s2 = salad
        //d = drink
        }
    }

