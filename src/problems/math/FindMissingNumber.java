package problems.math;

public class FindMissingNumber {

    /*
     *
     * the below array is supposed to have a range of number from 1 to 10
     * {10, 2, 1, 4, 5, 3, 7, 8, 6}
     * one number is missing (9 in this case)
     * write java code to find the missing number from the array
     * use a static helper method to find it
     *
     */

    public static void main(String[] args) {

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        System.out.println(Helper(array));



    } public static  int Helper ( int [] array){

        int n = array.length + 1;

        int sum = (n * (n+1))/2;

        for (int i = 0 ; i < array.length; i++) {
            sum = sum - array [i];
        }return sum;



    }
}
