package model;

public class TicketInventoryManager {
    private static TicketInventoryManager instance;

    private TicketInventoryManager() {
        // private constructor to prevent instantiation
    }

    public static synchronized TicketInventoryManager getInstance() {
        if (instance == null) {
            instance = new TicketInventoryManager();
        }
        return instance;
    }

    
}