package Lectures.Composition;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int numRamSlots;
    private int numPCISlots;
    private String bios;

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumRamSlots() {
        return numRamSlots;
    }

    public int getNumPCISlots() {
        return numPCISlots;
    }

    public String getBios() {
        return bios;
    }

    public String getModel() {

        return model;
    }

    public Motherboard(String model, String manufacturer, int numRamSlots, int numPCISlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.numRamSlots = numRamSlots;
        this.numPCISlots = numPCISlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program: " + programName + " is now loading. . .");
    }



}
