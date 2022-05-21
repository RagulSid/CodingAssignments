// Problem 6
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/NthPrime.java
// The sum of the squares of the first ten natural numbers is,
//  1^2+ 2^2 + 2^3+.....+ 10^2 = 385

// The square of the sum of the first ten natural numbers is,
// (1 + 2 + 3 + … + 10)^2 = 3025

// Hence the difference between the sum of the squares of the first ten natural numbers
// and the square of the sum is 3025 - 385 = 2640.

// Find the difference between the sum of the squares of the first one hundred natural
// numbers and the square of the sum.


public class Diff_SumofSquares {
    public static void main(String[] args) {
        int n = 100;
        
        int sumofsquares = (n*(n+1)*(2*n+1))/6;
        int sumofn = (n*(n+1))/2;
        sumofn = sumofn*sumofn;

        int m = Math.abs(sumofsquares-sumofn);
        System.out.println(m);
    }  
}