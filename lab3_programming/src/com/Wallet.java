package com;

public class Wallet {
    private int sum;
    public Wallet(int sum){
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }
    public void subtract(int a){
        sum -= a;
    }
    public void add(int a){
        sum += a;
    }
}
