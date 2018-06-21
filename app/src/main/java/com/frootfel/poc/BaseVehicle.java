package com.frootfel.poc;

public class BaseVehicle implements Vehicle {
    public int speed;
    public int gear;
    public Direction direction;

    @Override
    public void ChangeGear(Integer cgear) {
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

    @Override
    public void TurnSignal(Direction dir) { //Direction =type, use dir to call
        if(dir == Direction.Left || dir == Direction.Right){
            this.speed = speed-5;
            this.direction = dir;
        }
    }

    @Override
    public void FuelLevel(Fuel tank) {
        this.FuelLevel(Fuel.Full);
    }

}
