package com.parking.lot.payment;

import com.parking.lot.ticket.ParkingTicket;

public class CashPayment extends PaymentOperation{

    @Override
    public void processTicket(ParkingTicket ticket) {
        System.out.println("processing paymet "+ticket.getTicketId());
    }
}
