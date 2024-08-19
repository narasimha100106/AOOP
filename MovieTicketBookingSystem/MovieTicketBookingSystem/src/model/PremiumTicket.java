package model;

public class PremiumTicket implements Ticket {
    @Override
    public String getType() {
        return "Premium";
    }

    @Override
    public double getPrice() {
        return 20.0; // Example price
    }
}