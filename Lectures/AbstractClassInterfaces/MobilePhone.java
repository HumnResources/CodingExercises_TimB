package Lectures.AbstractClassInterfaces;

public class MobilePhone implements ITelehpone {
    private int myNumber;
    boolean isON;
    private boolean isRinging;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isON = true;
        System.out.println("Powering on....");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isON)
            System.out.println("Now dialing: "+phoneNumber+"...");
    }

    @Override
    public void answer() {
        if (isRinging)
            System.out.println("Answering phone");
    }

    @Override
    public boolean callPhone(int phonenumber) {
        if(phonenumber == myNumber && isON) {
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
