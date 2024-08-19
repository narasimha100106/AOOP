package test;

import static org.junit.Assert.assertTrue;

import model.StandardTicket;
import model.PremiumTicket;
import model.Ticket;
import factory.StandardTicketFactory;
import factory.PremiumTicketFactory;
import model.TicketFactory;

import org.junit.Test;

public class TicketFactoryTest {

    @Test
    public void testCreateStandardTicket() {
        TicketFactory factory = new StandardTicketFactory();
        Ticket ticket = factory.createTicket();
        assertTrue(ticket instanceof StandardTicket);
        assertTrue(ticket.getType().equals("Standard"));
        assertTrue(ticket.getPrice() == 10.0);
    }

    @Test
    public void testCreatePremiumTicket() {
        TicketFactory factory = new PremiumTicketFactory();
        Ticket ticket = factory.createTicket();
        assertTrue(ticket instanceof PremiumTicket);
        assertTrue(ticket.getType().equals("Premium"));
        assertTrue(ticket.getPrice() == 20.0);
    }
}
