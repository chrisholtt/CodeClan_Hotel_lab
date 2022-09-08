public class Booking {
    private Room room;
    private int numberOfNights;

    public Booking(Room room, int numberOfNights) {
        this.room = room;
        this.numberOfNights = numberOfNights;
    }


    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setBedroom(Room room) {
        this.room = room;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
}
