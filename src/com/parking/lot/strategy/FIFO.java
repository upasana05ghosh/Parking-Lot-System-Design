package com.parking.lot.strategy;

import java.util.Queue;

import com.parking.lot.VehicleType;
import com.parking.lot.parkingspot.ParkingSpot;

public class FIFO implements ParkingStrategy{

    Queue<ParkingSpot> compactSpot;

    public FIFO(Queue<ParkingSpot> compactSpot) {
        compactSpot = this.compactSpot;
    }

    @Override
    public ParkingSpot allocateParkingLot(VehicleType type) {
        switch(type) {
        case COMPACT: ParkingSpot spot =  compactSpot.poll();
            return spot;
        }
        return null;
    }

}
