package com.frootfel.poc;

public class Human {

    public String name;
    public String direction;
    private String larm;
    private String rarm;
    private String lleg;
    private String rleg;
    private String nose;
    private String hand;

    //Class Methods

    public Human(){
        this.larm = "LeftA";
        this.rarm = "RightA";
        this.lleg = "LeftL";
        this.rleg = "RightL";
        this.nose = "Nose";
        this.hand = "Hand";
    }
    public Human(String name){
        this.name = name;

    }

    public void Walk() {


    }

    public void Walk(int steps) {}

    public void Talk(String words) {

    }

    public void Talk() {}


}
