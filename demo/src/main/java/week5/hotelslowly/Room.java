package week5.hotelslowly;

public class Room {
    private int nrOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int nrOfBeds, double price, boolean occupied, boolean dirty) {
        this.nrOfBeds = nrOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNrOfBeds() {
        return nrOfBeds;
    }

    public void setNrOfBeds(int nrOfBeds) {
        this.nrOfBeds = nrOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return !isOccupied() && !isDirty();
    }

    public void checkIn(){
        if(isAvailable()) {
            setDirty(true);
            setOccupied(true);
        }
    }

    public void checkOut(){
        setOccupied(false);
        cleanRoom();
    }
    public void cleanRoom(){
        setDirty(false);
    }
}
