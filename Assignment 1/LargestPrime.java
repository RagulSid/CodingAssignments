// Problem 3
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/LargestPalindromeNum.java
// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143?


public class LargestPrime {
    public static void main(String[] args) {
        long n = 600851475143L;
        for (long i = 2; i < n/2 ; i++) {
            while (n%i==0) {        //if yes -> largest prime
                n=n/i;             
            }
        }
        System.out.println(n);
    }   
}
