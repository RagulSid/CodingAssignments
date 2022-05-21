// Problem 10
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/GreatestProduct.java
// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

// Find the sum of all the primes below two million.
// Ans: 142913828922

public class SumofPrime {
    public static void main(String[] args) {
        long num = 2000000; 
        boolean[] prime = new boolean[(int)(num+1)];

        for (int i = 2; i <= num ; i++) {
            prime[i] = true;
        }

        for(int i = 2; i < Math.sqrt(num); i++){
            if(prime[i]){
                for(int j = i; i*j <= num; j++){
                    prime[i*j] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i <=num; i++) {
            if(prime[i]){
                sum += i;
            }
        }
        System.out.println(sum);
    }    
}
