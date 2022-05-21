// Problem 9
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/SumofPrime.java
// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
// a^2 + b^2 = c^2

// For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc

public class PythagoreanTriplet {
        public static void main(String[] args) { 
        int num = 1000;
        long ans;
        long product = -1;
        for(int a = 1; a<num/3; a++){
            int b = (num*num-2*a*num)/(2*num-2*a);
            int c = num-a-b;
            if(c*c==(a*a+b*b)){
                ans = a*b*c;
                if(ans>product){
                    product = ans;
                }
                System.out.println(product);
            }
        }
    }
}