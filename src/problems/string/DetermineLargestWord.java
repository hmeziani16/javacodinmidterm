package problems.string;

public class DetermineLargestWord {

    public static void main(String[] args) {

        System.out.println(LongWord());
        System.out.println(LongWord().length());
    }

    public static String LongWord (){

        String[] words = ("Human brain is a biological learning machine").split(" ");


        String largest = words[0];

        for (int i = 1; i < words.length; i++){

            if (largest.length() < words[i].length())
                largest = words[i];
        }
        return largest;

    }

}
