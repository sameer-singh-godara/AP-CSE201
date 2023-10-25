package org.example;

public class Deal extends Offer {
    private int ticketNumber;
    private int percentage;
    private int id;
    private int isOpen;

    public Deal(int ticketNumber, int percentage, int id, int valid) {
        this.ticketNumber = ticketNumber;
        this.percentage = percentage;
        this.id = id;
        this.isOpen = valid;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public int getPercentage() {
        return percentage;
    }

    @Override
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getIsOpen() {
        return isOpen;
    }

    @Override
    public void setIsOpen(int isOpen) {
        this.isOpen = isOpen;
    }
}
