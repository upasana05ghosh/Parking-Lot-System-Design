package com.parking.lot;

import com.parking.lot.parkingspot.ParkingSpot;
import com.parking.lot.strategy.ParkingStrategy;
import com.parking.lot.ticket.ParkingTicket;

public class ParkingLot {

    private long id;
    private Address address;

    private int motorcycleFreeSpotCounter;
    private int compactFreeSpotCounter;
    private int largeFreeSpotCounter;
    private ParkingStrategy strategy;

    private static ParkingLot instance = new ParkingLot();

    private ParkingLot() {
        //initialize various stuff
    }

    public static ParkingLot getInstance() {
        return instance;
    }

    public synchronized ParkingTicket getTicket(VehicleType vehicleType)
            throws ParkingFullException {

        if(isFull(vehicleType))
            throw new ParkingFullException("Parking is full for vehiclType "
                    + vehicleType.name());

        ParkingTicket ticket = new ParkingTicket();
        ParkingSpot parkingSpot = strategy.allocateParkingLot(vehicleType);
        ticket.setSpot(parkingSpot);
        updateParkingSpot(parkingSpot);
        return ticket;
    }


    private boolean isFull(VehicleType vehicleType) {
        switch (vehicleType) {
        case COMPACT:
            return compactFreeSpotCounter == 0;
        case LARGE:
            return largeFreeSpotCounter == 0;
        default:
            break;
        }
        return false;
    }

    private void updateParkingSpot(ParkingSpot spot) {
        spot.setOccupied(true);
    }
}
