package datastructure.collections;

import java.util.*;


public class UseCollections {


    public static void main(String[] args) {

        Integer[] array1 = {1, 3, 2, 4, 8, 9, 0};
        Integer[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};


        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = Arrays.asList(array2);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println();

        HashSet<Integer> union = new HashSet<>();

        Collections.addAll(union, array1);
        Collections.addAll(union, array2);


        System.out.println(union);



        Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(array1));
        Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(array2));
        s1.retainAll(s2);

        Integer[] result = s1.toArray(new Integer[s1.size()]);
        System.out.println(Arrays.toString(result));

        HashSet <Integer> h = new HashSet<>();

        for ( int i=0; i<array1.length;i++){
            h.add(array1[i]);

        }
        for( int i=0; i<array2.length;i++){
            h.add(array2[i]);

        }

        System.out.println(h);


    }

}








