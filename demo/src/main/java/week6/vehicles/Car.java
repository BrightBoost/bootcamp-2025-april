package week6.vehicles;

public class Car extends Vehicle {
    private int nrChildSeatSpots;

    public boolean isFamilyCar() {
        if(nrChildSeatSpots > 0 && getNumberOfPassengers() > 4) {
            return true;
        }
        return false;
    }

    public int getNrChildSeatSpots() {
        return nrChildSeatSpots;
    }

    public void setNrChildSeatSpots(int nrChildSeatSpots) {
        this.nrChildSeatSpots = nrChildSeatSpots;
    }
}
