package classes;


public class Node {
    private int NodeNum;
    public Node next;

    // конструктор
    public Node(int ANodeNum) {
        this.NodeNum = ANodeNum;
        this.next    = null;

    }

    public String toString() {
        return "<"+NodeNum+">";
    }

}
