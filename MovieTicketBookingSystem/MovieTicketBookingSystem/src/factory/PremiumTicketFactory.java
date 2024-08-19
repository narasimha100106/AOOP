package factory;

import model.PremiumTicket;
import model.Ticket;
import model.TicketFactory;

public class PremiumTicketFactory implements TicketFactory {
    @Override
    public Ticket createTicket() {
        return new PremiumTicket();
    }
}