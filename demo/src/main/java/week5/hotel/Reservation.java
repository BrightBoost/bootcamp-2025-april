package week5.hotel;

public class Reservation {
    private String roomType;
    private double price;
    private int nrOfNights;
    private boolean weekend;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public double getReservationTotal() {
        return 0;
    }
}
