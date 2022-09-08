import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Conference conferenceRoom;

    @Before
    public void setUp(){
        conferenceRoom = new Conference(RoomType.CONFERENCE, "Johnson");
    }

    @Test
    public void canGetName(){
        assertEquals("Johnson", conferenceRoom.getName());
    }


}
