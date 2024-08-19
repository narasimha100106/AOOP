package test;

import model.Movie;
import model.User;
import org.junit.Before;
import org.junit.Test;

public class ObserverTest {

    private Movie movie;
    private User user1;
    private User user2;

    @Before
    public void setUp() {
        movie = new Movie();
        user1 = new User("User1");
        user2 = new User("User2");
    }

    @Test
    public void testNotification() {
        movie.addObserver(user1);
        movie.addObserver(user2);

        // Test notification (you may need to capture the output for verification)
        movie.notifyObservers("Seats are filling up fast!");

        
    }
}
