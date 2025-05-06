package week5.hotelslowly;

public class Hotel {
    private String name;
    private int nrOfSuites;
    private int nrOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int nrOfSuites, int nrOfRooms) {
        this.name = name;
        this.nrOfSuites = nrOfSuites;
        this.nrOfRooms = nrOfRooms;
    }

    public Hotel(String name, int nrOfSuites, int nrOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.nrOfSuites = nrOfSuites;
        this.nrOfRooms = nrOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNrOfSuites() {
        return nrOfSuites;
    }

    public int getNrOfRooms() {
        return nrOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        if(isSuite && getAvailableSuites() >= numberOfRooms || (!isSuite && getAvailableRooms() >= numberOfRooms)) {
            return true;
        }
        return false;
    }

    public int getAvailableRooms(){
        return nrOfRooms - bookedBasicRooms;
    }

    public int getAvailableSuites(){
        return nrOfSuites - bookedSuites;
    }
}
