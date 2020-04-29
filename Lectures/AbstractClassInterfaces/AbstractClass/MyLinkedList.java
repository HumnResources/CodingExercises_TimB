package Lectures.AbstractClassInterfaces.AbstractClass;

public class MyLinkedList implements INodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null)
                    // newItem is greater, move right if possible
                    currentItem = currentItem.next();
                else {
                    // No item next so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }
            else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    // newItem is less, insert left if possible
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                }
                else {
                    // The node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;

                }
                return true;
            }
            else
                return false;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // Found item to delete
                if (this.root == currentItem)
                    this.root = currentItem.next();
                else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() == null)
                        currentItem.next().setPrevious(currentItem.previous());
                }
                return true;
            }
            else if (comparison < 0)
                currentItem = currentItem.next();
            else
                /*
                 *  We are at an item past the one to be deleted
                 *  so the item is not in the list.
                 */
                return false;
        }
        /*
         *  We have reached the end of the list without finding the item.
         */
        return false;
    }

    @Override
    public void traverseList(ListItem root) {
        if (root == null)
            System.out.println("Root is null");
        else
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
//        if (root != null) {
//            traverseList(root.next());
//        }
//        Bad practice as the above has a depth of 60+ :o
    }
}
