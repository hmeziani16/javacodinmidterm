package problems.math;

public class Fibonacci {

    /*
     *
     * write 30 Fibonacci numbers with java
     * 0,1,1,2,3,5,8,13
     *
    */

    public static void main(String[] args) {

        int n1 =0, n2 =1, sum=0;

        System.out.print(n1+" "+n2);

        for (int i=2;i<30;i++) {

            sum = n1 + n2;

            System.out.println(" " + sum);

            n1 = n2;
            n2 = sum;
        }


    }
}
