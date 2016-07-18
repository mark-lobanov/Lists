package classes;

import classes.Consts;
import classes.Node;

public class NodeList {

    // list head reference
    private Node data;
    // list end reference
    private Node last;
    // items counter
    private int itemsCount;

    public NodeList() {
        this.data = null;
        this.last = null;
        this.itemsCount = 0;
    }

    public int getItemsCount() {
        return this.itemsCount;
    }

    public void clear() {
        // temporary variable for items exchange in cycle
        Node tmp = null;
        // current Node item in cycle
        Node work = this.data;
        // clearing next-reference
        while (work != null) {
            tmp = work.getNext();
            work.setNext(null);
            work = tmp;
        }
        this.data = null;
        this.last = null;
        itemsCount = 0;
    }

    // delete Item from end of list
    public int remove() {
        return remove(itemsCount - 1);
    }

    // delete any Item
    public int remove(int index) {
        if ((index < 0) || (index > itemsCount-1)) {
            return Consts.INDEX_IS_OUT_OF_RANGE;
        } else if (index > 0) {
            Node tmp = getItem(index).getNext();
            getItem(index - 1).setNext(tmp);
        } else if (index == 0) {
            this.data = this.data.getNext();
        }
        return --itemsCount;
    }

    // add Item to end of list
    public int add(Node newNode) {
        return add(newNode, itemsCount);
    }

    // add Item at indexed position
    public int add(Node newNode, int index) {
        if ((index < 0) || (index > itemsCount)) {
            return Consts.INDEX_IS_OUT_OF_RANGE;
        } else if (itemsCount == 0) {
            this.data = newNode;
            this.last = newNode;
        } else if (index == itemsCount) {
            getItem(itemsCount - 1).setNext(newNode);
            this.last = newNode;
        } else {
            Node tmp = getItem(index).getNext();
            getItem(index).setNext(newNode);
            newNode.setNext(tmp);
        }
        return ++itemsCount;
    }

    // return Node by index
    public Node getItem(int index) {
        // returning value
        Node ret = data;

        if ((itemsCount == 0) || (ret == null) || (index >= itemsCount)) {
            return null;
        } else {
            int i = 0;
            while ((i != index) && (i <= itemsCount)) {
                ret = ret.getNext();
                i++;
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        String ret = "";
        Node item = this.data;
        while (item != null) {
            ret += item.toString();
            item = item.getNext();
            if (item != null) {
                ret += " ";
            }
        }
        return ret;
    }
}
