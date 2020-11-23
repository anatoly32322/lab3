package com;

public enum Properties {
    COMFORTABLE(50, "Удобный"),
    UNCOMFORTABLE(10, "Неудобный"),
    SOFT(20, "Мягкий"),
    HARD(10, "Жёсткий"),
    ELASTIC(30, "Упругий"),
    INELASTIC(10, "Неупругий");
    private int degree;
    private String propertie;
    Properties(int degree, String propertie){
        this.degree = degree;
        this.propertie = propertie;
    }

    public int getDegree() {
        return degree;
    }

    public String getPropertie() {
        return propertie;
    }
}
