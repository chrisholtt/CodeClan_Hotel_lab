import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conferences;

    private Booking booking;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferences = new ArrayList<Conference>();
    }

    public String getName() {
        return name;
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConference(Conference conference){
        this.conferences.add(conference);
    }

    public int getBedrooms() {
        return bedrooms.size();
    }

    public int getConferences() {
        return conferences.size();
    }

    public void checkInGuest(Room room, Guest guest){
        room.add(guest);
    }

    public void checkOutGuest(Room room){
        room.removeAllGuests();
    }


    public int getNumberOfGuests(Room room){
        return room.getNumberOfGuests();
    }

    public Booking bookForNights(Room room, int numberOfNights){
        booking = new Booking(room, numberOfNights);
        return booking;
    }




}
