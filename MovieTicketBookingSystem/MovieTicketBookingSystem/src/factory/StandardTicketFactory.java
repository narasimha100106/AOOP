package factory;

import model.StandardTicket;
import model.Ticket;
import model.TicketFactory;

public class StandardTicketFactory implements TicketFactory {
    @Override
    public Ticket createTicket() {
        return new StandardTicket();
    }
}