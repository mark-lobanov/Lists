package run;

import classes.*;

public class mainRun
{
    public static void main(String[ ] args)
      {
        NodeList list = new NodeList();

        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));
        list.add(new Node(21), 1);
        list.add(new Node(31), 3);
        list.add(new Node(41), 5);
        list.add(new Node(6));


        System.out.println(list);
        System.out.println("Count="+list.getItemsCount());

        System.out.println("\nadding error="+list.add(new Node(61), 61));

        list.remove();

        System.out.println("\nRemove last");
        System.out.println(list);
        System.out.println("Count="+list.getItemsCount());

        list.remove(2);

        System.out.println("\nRemove 2");
        System.out.println(list);
        System.out.println("Count="+list.getItemsCount());

        list.clear();;

        System.out.println("\nRemove all");
        System.out.println(list);
        System.out.println("Count="+list.getItemsCount());

        list.add(new Node(222));
        System.out.println(list);
        System.out.println("Count="+list.getItemsCount());
      }
}
