package com.parking.lot.parkingspot;

public class ParkingSpot {

    private int id;
    private ParkingSpotType type;
    private boolean isOccupied;

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ParkingSpotType getType() {
        return type;
    }
    public void setType(ParkingSpotType type) {
        this.type = type;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

}
