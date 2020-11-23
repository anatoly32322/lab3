package com;

public class Pillow {
    private Properties[] properties;
    private String name;
    private int convenience;
    public Pillow(String name, Properties[] properties){
        this.name = name;
        this.properties = properties;
        for (int i = 0; i < properties.length; i++){
            this.convenience += properties[i].getDegree();
        }
    }

    public String getName() {
        return name;
    }

    public int getConvenience() {
        return convenience;
    }

    public Properties[] getProperties() {
        return properties;
    }

    public String getPropertiesString() {
        String a = "";
        for (int i = 0; i < properties.length; i++){
            a += (i == properties.length - 1)?(properties[i].getPropertie()):(properties[i].getPropertie() + ", ");
        }
        return a;
    }
}
