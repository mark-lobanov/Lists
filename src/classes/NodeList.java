package classes;

import classes.Consts;
import classes.Node;


public class NodeList {
    // ��������� ������ �� ������ � ����� ������
    private Node data, last;
    // ���������� ��������� � ������
    private int Count;

    public NodeList() {
        this.data = null;
        this.last = null;
        this.Count = 0;
    }

    public int getCount() {
        return Count;
    }


    public void Clear() {
        Node tmp = null, work = this.data;
        // �������� ������ �� ��������� Node � ������
        while (work != null)
        {
            tmp = work.next;
            work.next = null;
            work = tmp;
        }
        this.data = null;
        this.last = null;
        Count = 0;
    }

    // ������� � �����
    public int Remove() {
        return Remove(Count-1);
    }

    // �������
    public int Remove(int Index) {
        if ((Index<0) || (Index>Count-1)) {
            return Consts.INDEX_IS_OUT_OF_RANGE;
        } else if (Index>0) {
            Node tmp = getItem(Index).next;
            getItem(Index-1).next = tmp;
        }
        return --Count;
    }

    // �������� � �����
    public int Add(Node new_node) {
        return Add(new_node, Count);
    }

    // ��������
    public int Add(Node new_node, int Index) {
        if (Index<0) {
            return Consts.INDEX_IS_OUT_OF_RANGE;
        } else if (Count==0) {
            this.data = new_node;
            this.last = new_node;
        } else if (Index>=Count) {
                 getItem(Count-1).next = new_node;
                 this.last = new_node;
        } else {
                 Node tmp = getItem(Index).next;
                 getItem(Index).next = new_node;
                 new_node.next = tmp;
        }
      return ++Count;
    }

    // �������� Node �� �������
    public Node getItem(int Index) {
        Node ret = data;

        if ((Count==0) || (ret==null) || (Index>=Count)) {
            return null;
        } else {
                int i = 0;
                while ((i != Index) && (i<=Count)) {
                  ret = ret.next;
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
          item = item.next;
          if (item != null) {
              ret += " ";
          }
      }
      return ret;
    }
}
