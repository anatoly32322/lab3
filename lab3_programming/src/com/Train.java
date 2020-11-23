package com;

public class Train implements ITrain {
    private String name;
    private TrainModels TrainModel;
    public Train(String name, TrainModels TrainModel){
        this.name = name;
        this.TrainModel = TrainModel;
    }
    public String getName(){
        return name;
    }
    public TrainModels getTrainModel(){
        return TrainModel;
    }
    public void Start(){
        System.out.println("*Поезд поехал*");
    }
    public void Stop(){
        System.out.println("*Поезд остановился*");
    }
    public void Chu_Chu(){
        System.out.println("*Чух-Чух!*");
    }
}
