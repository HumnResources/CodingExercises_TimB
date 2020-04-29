package Lectures.AbstractClassInterfaces.AbstractClass;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    /*
     * Each list item object can hold prev/next item. The abstract class creates
     * a contract for any inheriting class. That they must contain these methods.
     */



}
