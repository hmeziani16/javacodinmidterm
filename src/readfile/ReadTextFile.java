package readfile;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ReadTextFile {
    /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/readfile/file-data"));

            String s;
            while ((s = reader.readLine()) != null) {
                String [] words = s.split(" ");
                LinkedList wordsListe = new LinkedList(Arrays.asList(words));


                Iterator it = wordsListe.iterator();



                while (it.hasNext()) {
                    System.out.println(it.next().toString());

                }



                //for (Object index : wordsListe) {

                  //  System.out.println(index);

              //  }


              //  System.out.println(wordsListe.size( ) );



            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
