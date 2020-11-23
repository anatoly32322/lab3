package com;

public class Ticket {
    private String name;
    private int price;
    public Ticket(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
