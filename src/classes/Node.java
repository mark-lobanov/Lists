package classes;

public class Node {

    // Node number
    private int nodeNum;
    // next Node reference
    private Node next;

    // constructor
    public Node(int nodeNum) {
        this.nodeNum = nodeNum;
        this.setNext(null);
    }

    @Override
    public String toString() {
        return "<" + nodeNum + ">";
    }

    /*
     * Getters and Setters for private members
     */
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
