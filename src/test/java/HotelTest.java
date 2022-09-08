import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom doubleBedroom;
    Conference conference;
    Guest guest;

    Booking booking;

    @Before
    public void setUp(){
        hotel = new Hotel("CodeClan Tower");
        bedroom = new Bedroom(RoomType.SINGLE, 56);
        doubleBedroom = new Bedroom(RoomType.DOUBLE, 43);
        conference = new Conference(RoomType.CONFERENCE, "Johnson");
    }

    @Test
    public void getName() {
        assertEquals("CodeClan Tower", hotel.getName());
    }

    @Test
    public void canAddAndGetBedrooms() {
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom);
        assertEquals(2, hotel.getBedrooms());
    }

    @Test
    public void canAddAndGetConferences() {
        hotel.addConference(conference);
        hotel.addConference(conference);
        hotel.addConference(conference);
        assertEquals(3, hotel.getConferences());
    }

    @Test
    public void cannotCheckInGuestIfOverCapactity(){
        hotel.checkInGuest(bedroom, guest);
        hotel.checkInGuest(bedroom, guest);
        assertEquals(1, hotel.getNumberOfGuests(bedroom));
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(doubleBedroom, guest);
        hotel.checkInGuest(doubleBedroom, guest);
        hotel.addBedroom(doubleBedroom);
        assertEquals(2, hotel.getNumberOfGuests(doubleBedroom));
        assertEquals(1, hotel.getBedrooms());
    }

    @Test
    public void canCheckoutGuest(){
        hotel.checkInGuest(doubleBedroom, guest);
        hotel.checkInGuest(doubleBedroom, guest);
        hotel.checkOutGuest(doubleBedroom);
        assertEquals(0, doubleBedroom.getNumberOfGuests());
    }

    @Test
    public void canBookForANumberOfNights(){
        booking = new Booking(bedroom, 7);
        assertEquals(7, hotel.bookForNights(bedroom, 7).getNumberOfNights());
    }


}