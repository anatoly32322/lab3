package com;

import java.util.Objects;

public class Person implements IPerson {
    private String name = null;
    private PersonProperties[] properties = {null};
    private Wallet wallet = new Wallet(0);
    private Ticket ticket = null;
    public Person(String name){
        this.name = name;
    }
    public Person(String name, int wallet){
        this.name = name;
        this.wallet.add(wallet);
    }
    public Person(String name, PersonProperties[] properties){
        this.name = name;
        this.properties = properties;
    }
    public Ticket getTicket() {
        return ticket;
    }

    public Wallet getWallet() {
        return wallet;
    }
    public void CalmDownSE(Person a){}
    public void CheckForTicket(Person a){}
    public PersonProperties[] getProperties(){
        return properties;
    }
    public String getPropertiesString() {
        String a = "";
        for(int i = 0; i < properties.length; i++){
            a += (i == properties.length - 1)?(properties[i].getProperties()):(properties[i].getProperties() + ", ");
        }
        return a;
    }
    public String getName(){
        return name;
    }
    public boolean BuyTicket(Ticket a){
        if (wallet.getSum() < a.getPrice()){
            System.out.println("Объект " + name + " не может позволить себе купить билет стоимостью " + a.getPrice());
            return true;
        }
        wallet.subtract(a.getPrice());
        System.out.println("*Объект " + name + " покупает билеты по цене " + a.getPrice() + "*");
        System.out.println("*Общая сумма на руках у объекта " + name + " теперь составляет " + wallet.getSum() + '*');
        ticket = a;
        return false;
    }
    public void GetOnTheTrain(Train a){
        System.out.println("*Объект " + name + " садится на поезд " + a.getTrainModel().getName() + '*');
    }
    public void GetNervous(){
        System.out.println("*Объект " + name + " начинает нервничать*");
    }
    public void CalmDown(){
        System.out.println("*Объект " + name + " успокаивается*");
    }
    public void Sleep(Pillow a){
        System.out.println("*Объект " + name + " ложится на подушку с свойствами:" + a.getPropertiesString() + " - и пытаяется заснуть*");
        if (a.getConvenience() > 50) {
            System.out.println("*Объект " + name + " наелся и спит*");
        }
        else {
            System.out.println("*Объект " + name + " не может заснуть*");
        }
    }
    public boolean TryToSpeak(Person a){
        System.out.println("*Объект " + name + " пытается завести разговор с объектом " + a.getName() + ", имеющим свойства:" + a.getPropertiesString() + '*');
        boolean flag = true;
        for (PersonProperties b : a.getProperties()){
            if (b.getProperties() == PersonProperties.RUDE.getProperties()){
                flag = false;
            }
            if (b.getProperties() == PersonProperties.TACITURN.getProperties() && Math.random() <= 0.5){
                flag = false;
            }
        }
        if (flag){
            System.out.println("*Объект " + name + " успешно завёл разговор с объектом " + a.getName() + '*');
        }
        else{
            System.out.println("*Объект " + name + " не смог завести разговор с объектом " + a.getName() + '*');
        }
        return flag;
    }
    public void Speak(Person a){
        System.out.println("*Объект " + name + " разговаривает с объектом " + a.getName() + '*');
    }

    public void Speak(String topic){
        System.out.println(name + ": " + topic + '.');
    }
    public boolean Think(String topic){
        System.out.println("*Объект " + name + " рассуждает над тем, что " + topic + '*');
        if (Math.random() <= 0.5){
            System.out.println("*Объект " + name + " понял, что он прав*");
            return true;
        }
        System.out.println("*Объект " + name + " так ни к чему и не пришёл*");
        return false;
    }
    @Override
    public String toString(){
        return getClass() + "{name='" + name + "', properties=" + getPropertiesString() + ", wallet=" + getWallet().getSum() + ", ticket=" + getTicket().getName() +"}";
    }

    @Override
    public boolean equals(Object a){
        if (this == a) {
            return true;
        }
        if (!(a instanceof Person)){
            return false;
        }
        Person person = (Person)a;
        return (getName() == person.getName()) && (getTicket() == person.getTicket()) && (getWallet() == person.getWallet()) && (getPropertiesString() == person.getPropertiesString());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getPropertiesString(), getWallet(), getTicket());
    }
}
