package com.frootfel.poc;

public class Bike extends BaseVehicle{

    public Bike(){
        this.speed = 0;
        this.gear = 0;
    }

    public String printStats() {
        return (speed + " " + gear);
    }

    @Override
    public void ChangeGear(Integer cgear) {
        super.ChangeGear(cgear);
        this.gear=cgear;

    }

    @Override
    public void SpeedUp(Integer increase) {
       if (speed < 20){
           this.speed=(speed+increase);
       }
    }

    @Override
    public void ApplyBrakes(Integer decrease) {
        if (speed > 0){
            this.speed=(speed-decrease);
        }
    }
}
