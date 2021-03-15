package com.parking.lot.payment;

import com.parking.lot.parkingspot.ParkingSpot;
import com.parking.lot.ticket.ParkingTicket;
import com.parking.lot.ticket.TicketStatus;

public abstract class PaymentOperation implements Payment {

    @Override
    public boolean processAndUpdateTicket(ParkingTicket ticket) {
        processTicket(ticket);
        updateTicket(ticket);
        updateParkingLot(ticket);
        return true;
    }

    private void updateParkingLot(ParkingTicket ticket) {
        ParkingSpot spot = ticket.getSpot();
        spot.setOccupied(false);

    }

    private void updateTicket(ParkingTicket ticket) {
        ticket.setStatus(TicketStatus.PAID);
    }

    public abstract void processTicket(ParkingTicket ticket);

}
