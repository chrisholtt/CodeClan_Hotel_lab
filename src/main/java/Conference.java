public class Conference extends Room{
    private String name;

    public Conference(RoomType roomType, String name) {
        super(roomType);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
