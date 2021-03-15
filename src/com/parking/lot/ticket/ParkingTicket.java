package com.parking.lot.ticket;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.parking.lot.parkingspot.ParkingSpot;

public class ParkingTicket {
    private long ticketId;
    private ParkingSpot spot;
    private LocalDateTime issueTime;
    private TicketStatus status;

    public ParkingTicket() {
        status = TicketStatus.ACTIVE;
        issueTime = LocalDateTime.now();
        ticketId = 1234;
    }

    public long getTicketId() {
        return ticketId;
    }
    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }
    public ParkingSpot getSpot() {
        return spot;
    }
    public void setSpot(ParkingSpot spot) {
        this.spot = spot;
    }
    public LocalDateTime getIssueTime() {
        return issueTime;
    }
    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }
    public TicketStatus getStatus() {
        return status;
    }
    public void setStatus(TicketStatus status) {
        this.status = status;
    }
}
