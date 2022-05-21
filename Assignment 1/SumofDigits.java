// Problem 20
// n! means n × (n − 1) × ... × 3 × 2 × 1
// For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,

// and the sum of the digits in the number 10! is
// 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

// Find the sum of the digits in the number 100!

import java.math.BigInteger;
public class SumofDigits {

    public static int SumDigits(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = Integer.parseInt(s.substring(i, i+1));
            sum +=temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        BigInteger fact = BigInteger.valueOf(1);
        
        for (int i = 1; i <=100; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(SumDigits(fact.toString()));
    }
}
