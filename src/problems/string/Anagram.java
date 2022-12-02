package problems.string;

public class Anagram {

    public static void main(String[] args) {
        String word1 = "cat";
        String word2 = "act";

        if (AnagramCheck(word1, word2)) {

            System.out.println("It's an anagram");
        }
        else {
            System.out.println("It's not an anagram");
        }


    }static boolean AnagramCheck (String word1, String word2) {

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if (word1.length() != word2.length()){
            return false;
        }
        char[] stringOneToArray = word1.toCharArray();
        char[] stringTwoToArray = word2.toCharArray();

        Arrays.sort(stringOneToArray);
        Arrays.sort(stringTwoToArray);

        for(int i = 0; i < word1.length();i++){
            if(stringOneToArray[i] != stringTwoToArray[i]){
                return false;
            }
        }
        return true;


    }


}
