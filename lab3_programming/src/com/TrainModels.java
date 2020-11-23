package com;

public enum TrainModels {
    BLUE(120, "Blue"),
    YELLOW(110, "Yellow"),
    RED(100, "Red"),
    GREEN(130, "Green"),
    PINK(140, "Pink"),
    COOL(2281337, "Cool"),
    NOTCOOL(10, "NotCool");
    private int i;
    private String name;

    TrainModels(int i, String name){
        this.i = i;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getI() {
        return i;
    }
}
