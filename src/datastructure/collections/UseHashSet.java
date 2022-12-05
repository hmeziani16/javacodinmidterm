package datastructure.collections;

import java.util.HashSet;
import java.util.Iterator;

public class UseHashSet {

    /*
     *
     * demonstrate how to use HashSet that includes add,remove elements
     * add these elements to your collections: 3,3,4,1,7,1,0,7,4,5,0,9,8
     * use for each loop to print out data
     * print out the number of the elements of your HashSet
     *
     */

    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(3);
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(1);
        h.add(7);
        h.add(1);
        h.add(0);
        h.add(7);
        h.add(4);
        h.add(5);
        h.add(0);
        h.add(9);
        h.add(8);
        h.add(2);

        h.remove(2);



        for (int i = 7; i< h.size(); i++)  {

            System.out.println(h);


        }
       Iterator<Integer> it = h.iterator();
       while (it.hasNext()) {
           System.out.print(it.next()+ ",");
       }
       // }


    }
}
