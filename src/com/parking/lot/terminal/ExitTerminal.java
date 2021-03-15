package com.parking.lot.terminal;

import com.parking.lot.ticket.ParkingTicket;

public class ExitTerminal extends Terminal{

    public ExitTerminal(TerminalType type) {
        super(TerminalType.ENTRY);
    }

    public void scanTicket(ParkingTicket t) {
        System.out.println(t.getTicketId());
    }

    public void processTicket(ParkingTicket t) {
        System.out.println(t.getTicketId());
    }

}
