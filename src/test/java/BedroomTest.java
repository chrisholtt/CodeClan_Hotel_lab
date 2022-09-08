import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void setUp(){
        bedroom = new Bedroom(RoomType.SINGLE, 904);
    }

    @Test
    public void canGetRoomNumberFromBedroom(){
        assertEquals(904, bedroom.getRoomNumber());
    }
}
