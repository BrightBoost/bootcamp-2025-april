package week6;

public class Owl extends Bird {
    private boolean nightVision;
    public Owl(boolean nightVision) {
        this.nightVision = nightVision;
    }

    public boolean isNightVision() {
        return nightVision;
    }

    public void setNightVision(boolean nightVision) {
        this.nightVision = nightVision;
    }
}
