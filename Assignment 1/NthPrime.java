// Problem 7
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/AdjacentDigits.java
// By listing the first six prime nums: 2, 3, 5, 7, 11, and 13, we can see that the 6th
// prime is 13.
// What is the 10,001st prime num?

public class NthPrime {
    public static void main(String[] args) {
        //sieve of eratosthenes
        long numOfPrimes = 0;
        int num = 1;
        int max = 10000000;
        boolean[] prime = new boolean[max];
        for ( int i = 2; i < max; i++ ) {
            if ( prime[i] == true ) continue;

            numOfPrimes++;

            if ( numOfPrimes == 10001 ) {
                num = i;
                break;
            }

            for ( int j = i+i; j < max; j += i )   
                prime[j] = true;      //number is prime
        }
        System.out.println(num);
    }
}
