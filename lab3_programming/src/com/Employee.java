package com;

public class Employee extends Person {
    private Ticket ticket;
    public Employee(String name, Ticket ticket){
        super(name);
        this.ticket = ticket;
    }
    @Override
    public void CalmDownSE(Person a){
        System.out.println("*Объект " + getName() + " успокаивает объект " + a.getName() + '*');
    }
}
