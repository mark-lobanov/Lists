package run;

import classes.*;

public class mainRun
{
    public static void main(String[ ] args)
      {
        NodeList list = new NodeList();

        list.Add(new Node(1));
        list.Add(new Node(2));
        list.Add(new Node(3));
        list.Add(new Node(4));
        list.Add(new Node(5));
        list.Add(new Node(21), 1);
        list.Add(new Node(31), 3);
        list.Add(new Node(41), 5);
        list.Add(new Node(6));

        System.out.println(list);
        System.out.println("Count="+list.getCount());

        list.Remove();

        System.out.println("\nRemove last");
        System.out.println(list);
        System.out.println("Count="+list.getCount());

        list.Remove(2);

        System.out.println("\nRemove 2");
        System.out.println(list);
        System.out.println("Count="+list.getCount());

        list.Clear();;

        System.out.println("\nRemove all");
        System.out.println(list);
        System.out.println("Count="+list.getCount());

        list.Add(new Node(222));
        System.out.println(list);
        System.out.println("Count="+list.getCount());
      }
}
