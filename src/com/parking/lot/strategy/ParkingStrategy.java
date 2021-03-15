package com.parking.lot.strategy;

import com.parking.lot.VehicleType;
import com.parking.lot.parkingspot.ParkingSpot;

public interface ParkingStrategy {

    public ParkingSpot allocateParkingLot(VehicleType type);
}
