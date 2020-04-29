package Lectures.AbstractClassInterfaces.AbstractClass;

import java.util.List;

public interface INodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverseList(ListItem root);
}


//    SearchTree searchTree = new SearchTree(null);
//        searchTree.traverseList(searchTree.getRoot());
//
//                String stringdata = "1 3 7 6 5 9 7 6 8";
//
//                String[] splitArr = stringdata.split(" ");
//                for (String s : splitArr) {
//                searchTree.addItem(new Node(s));
//                }
//                searchTree.traverseList(searchTree.getRoot());
//        searchTree.removeItem(new Node("3"));
//        searchTree.traverseList(searchTree.getRoot());
//        searchTree.removeItem(new Node("5"));
//        searchTree.traverseList(searchTree.getRoot());
//        searchTree.removeItem(new Node("6"));
//        searchTree.traverseList(searchTree.getRoot());
//        searchTree.removeItem(new Node("7"));
//        searchTree.traverseList(searchTree.getRoot());
//        searchTree.removeItem(new Node("8"));
//
//        searchTree.traverseList(searchTree.getRoot());
