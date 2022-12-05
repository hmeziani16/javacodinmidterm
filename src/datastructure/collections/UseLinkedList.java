package datastructure.collections;

import java.util.Iterator;
import java.util.LinkedList;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import static jdk.nashorn.internal.objects.NativeSymbol.iterator;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        LinkedList<String> soccerTeamList = new LinkedList<String>();

        soccerTeamList.add("Mahrez");
        soccerTeamList.add("Slimani");
        soccerTeamList.add("Mbolhi");
        soccerTeamList.add("BenNacer");
        soccerTeamList.add("BenRahma");
        soccerTeamList.add("Pablo");

        soccerTeamList.remove("Pablo");


        Iterator <String>  it = soccerTeamList.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }

        for (String team : soccerTeamList) {
            System.out.println();
            System.out.println(team);

        }

        for (int i = 4; i < soccerTeamList.size(); i++) {

            System.out.println(soccerTeamList.toString());

        }

    }
}
