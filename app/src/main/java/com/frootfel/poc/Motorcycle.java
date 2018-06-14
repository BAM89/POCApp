package com.frootfel.poc;

public class Motorcycle implements Vehicle {
    public int speed;
    public int gear;

    public String printStats(String Stats){
        String printStats;
        printStats = Stats;

        return (speed + " " + gear);
    }


    @Override
    public void ChangeGear(Integer Gear) {

    }

    @Override
    public void SpeedUp(Integer Increase) {

    }

    @Override
    public void ApplyBrakes(Integer Decrease) {

    }
}
