package model;

public class StandardTicket implements Ticket {
    @Override
    public String getType() {
        return "Standard";
    }

    @Override
    public double getPrice() {
        return 10.0; // Example price
    }
}