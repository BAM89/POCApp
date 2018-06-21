package com.frootfel.poc;

public interface Vehicle {
    void ChangeGear(Integer cgear);
    void SpeedUp(Integer increase);
    void ApplyBrakes(Integer decrease);
    void TurnSignal(Direction dir);
    void FuelLevel(Fuel tank);

}
