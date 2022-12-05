package datastructure.collections;
import java.util.*;

public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        ArrayList<String> countrylist = new ArrayList<>();

        countrylist.add ("japan");
        countrylist.add ("australia");
        countrylist.add ("algeria");
        countrylist.add ("spain");
        countrylist.add ("canada");

        countrylist.remove ("spain");
        countrylist.clear();

        for (int i = 0; i < countrylist.size(); i++) {

            System.out.println( "Country: " + countrylist.get(i));

        }

        for (String country : countrylist) {

            System.out.println( "Country: " + country);

        }








    }
}
