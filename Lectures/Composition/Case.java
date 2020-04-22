package Lectures.Composition;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    Dimensions dims;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dims) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dims = dims;
    }


    public void powerButtonPressed() {
        System.out.println("Power button pressed...");
    }

}
