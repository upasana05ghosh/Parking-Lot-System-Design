package com.parking.lot.terminal;

import com.parking.lot.ticket.ParkingTicket;

public class EntryTerminal extends Terminal{

    public EntryTerminal(TerminalType type) {
        super(TerminalType.ENTRY);
    }

    public void printTicket(ParkingTicket t) {
        System.out.println(t.getTicketId());
    }

}
