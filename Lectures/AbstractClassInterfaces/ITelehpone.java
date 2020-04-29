package Lectures.AbstractClassInterfaces;

public interface ITelehpone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
   /*   Creates a contract that says each class implementing this interface
    *   must include above methods of each param/return type.
    */
}
