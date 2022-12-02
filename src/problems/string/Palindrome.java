package problems.string;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(Palindrome("MOM"));

    }
    public static Boolean Palindrome(String words) {

        boolean Palindrome = true;

        for (int i = 0; i < words.length() / 2; i++) {
            if (!(words.charAt(i) == words.charAt(words.length() - i - 1))) {
                Palindrome = false;
                break;
            }
        }
        return Palindrome;

    }


}
