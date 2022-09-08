import java.util.ArrayList;

public class Room {
    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacityFromEnum(){
        return this.roomType.getCapacity();
    }

    public void add(Guest guest){
        if ( this.roomType.getCapacity() > this.guests.size()) {
            this.guests.add(guest);
        }
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }

    public void removeAllGuests(){
        this.guests.clear();
    }




}
