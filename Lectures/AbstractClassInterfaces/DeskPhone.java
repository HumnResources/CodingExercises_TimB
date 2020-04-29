package Lectures.AbstractClassInterfaces;

public class DeskPhone implements ITelehpone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken. Powered on.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing: "+phoneNumber+"...");
    }

    @Override
    public void answer() {
        if (isRinging)
            System.out.println("Answering phone");
    }

    @Override
    public boolean callPhone(int phonenumber) {
        if(phonenumber == myNumber) {
            System.out.println("Ringing");
            this.isRinging = true;
        }
        else
            this.isRinging = false;
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
