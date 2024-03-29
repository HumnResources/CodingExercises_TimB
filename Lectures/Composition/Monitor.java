package Lectures.Composition;

public class Monitor {

        private String model;
        private String manufacturer;
        private int size;
        private Resolution resolution;


    public Monitor(String model, String manufacturer, int size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }


    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " " + color);
    }


}
