package com.parking.lot.payment;

import com.parking.lot.ticket.ParkingTicket;

public interface Payment {

    boolean processAndUpdateTicket(ParkingTicket ticket);
}
