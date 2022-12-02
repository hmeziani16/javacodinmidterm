
package problems.math;

public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {

        System.out.println(findPrimes(1, 2000000));

    }
    public static ArrayList<Integer> findPrimes(int start, int end) {

        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int n = start; n < end; n++) {
            boolean prime = true;

            int i = 2;
            while(i <= n/2) {
                if(n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }

            if(prime) {
                primes.add(n);
            }
        }

        return primes;
    }
}
