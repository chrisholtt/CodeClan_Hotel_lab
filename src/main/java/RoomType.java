public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    CONFERENCE(50);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

}
