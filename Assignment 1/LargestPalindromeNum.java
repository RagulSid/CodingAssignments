// Problem 4
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/SmallestPositivNum.java
// A palindromic number reads the same both ways. The largest palindrome made from
// the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers

public class LargestPalindromeNum {

    public static boolean isPalindrome(int n){
        int sum = 0, temp, rem;
        temp = n;
        while(n>0){
            rem = n % 10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        return temp == sum; 
    }
    
    public static void main(String[] args) {
        int max = -1;
        for(int i = 999 ; i >= 100; i--){
            if(max >= i*999){                
                break;
            }
            for(int j = 999 ; j>=i ; j--){
                int prod = i*j;
                while(max < prod && isPalindrome(prod)){ 
                    max = prod;
                }
            }
        }
        System.out.println(max > -1 ? max : "No Palindrome found");
    }
}
