package week5.hotelslowly;

public class Reservation {
    private String roomType;
    private int nrOfNights;
    private boolean weekend;

    public Reservation(String roomType, int nrOfNights, boolean weekend) {
        this.roomType = roomType;
        this.nrOfNights = nrOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNrOfNights() {
        return nrOfNights;
    }

    public void setNrOfNights(int nrOfNights) {
        this.nrOfNights = nrOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice(){
        double pricePerNight = 124;
        if(roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139;
        }
        if(isWeekend()){
            pricePerNight *= 1.1;
        }
        return pricePerNight;
    }

    public double getReservationTotal(){
        return nrOfNights * getPrice();
    }
}
