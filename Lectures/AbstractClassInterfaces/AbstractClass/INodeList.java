package Lectures.AbstractClassInterfaces.AbstractClass;

import java.util.List;

public interface INodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverseList(ListItem root);
}
