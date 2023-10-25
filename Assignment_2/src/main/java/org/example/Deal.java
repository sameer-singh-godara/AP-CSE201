package org.example;

public class Deal extends Offer {
    private int ticketNumber;
    private int percentage;
    private int id;
    private int valid;

    public Deal(int ticketNumber, int percentage, int id, int valid) {
        this.ticketNumber = ticketNumber;
        this.percentage = percentage;
        this.id = id;
        this.valid = valid;
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
    public int getValid() {
        return valid;
    }

    @Override
    public void setValid(int valid) {
        this.valid = valid;
    }
}
