package Lectures.ArrayLists;

import java.util.Objects;

public class Contact {

    private String name;
    private String number;

    public String getName() {return name;}
    public String getNumber() {return number;}
    public void setName(String name) {this.name = name;}
    public void setNumber(String number) {this.number = number;}

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.name, this.number);
    }
}
