package com.frootfel.poc;

public class Motorcycle extends BaseVehicle {
    public int speed;
    public int gear;

    public Motorcycle(){
     this.speed =  0;
     this.gear = 0;
    }


    public String printStats(){
        return (speed + " " + gear);
    }

    @Override
    public void ChangeGear(Integer cgear) {
        this.gear=cgear;
    }

    @Override
    public void SpeedUp(Integer increase) {
        this.speed=(speed+increase);
    }

    @Override
    public void ApplyBrakes(Integer decrease) {
       if (speed > 0){
           this.speed=(speed-decrease);
       }

       }
}
