package com.parking.lot;

public class ParkingFullException extends Exception {

    public ParkingFullException(String message) {
        super(message);
    }

    public ParkingFullException(){
        super();
    }

    private static final long serialVersionUID = 1L;

}
