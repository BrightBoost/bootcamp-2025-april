package week7.interfaces;

public class Image implements Printable {
    private String name;
    private String locationUrl;

    public Image(String name, String locationUrl) {
        this.name = name;
        this.locationUrl = locationUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationUrl() {
        return locationUrl;
    }

    public void setLocationUrl(String locationUrl) {
        this.locationUrl = locationUrl;
    }

    @Override
    public void print() {
        System.out.println("Printing image with name: " + name + " at " + locationUrl);
    }
}
