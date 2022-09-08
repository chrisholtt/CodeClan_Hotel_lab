import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class RoomTest {

    Room room;
    Guest guest;
    Bedroom bedroom;


    @Before
    public void setUp(){
        guest = new Guest("Keith" );
        room = new Room(RoomType.DOUBLE);
        bedroom = new Bedroom(RoomType.SINGLE, 904);
    }

    @Test
    public void canAddGuestToGuests(){
        room.add(guest);
        assertEquals(1, room.getNumberOfGuests());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, room.getCapacityFromEnum());
    }








}
