package test;

import static org.junit.Assert.assertSame;

import model.TicketInventoryManager;

import org.junit.Test;

public class TicketInventoryManagerTest {

    @Test
    public void testSingletonInstance() {
        TicketInventoryManager instance1 = TicketInventoryManager.getInstance();
        TicketInventoryManager instance2 = TicketInventoryManager.getInstance();
        assertSame(instance1, instance2);
    }
}