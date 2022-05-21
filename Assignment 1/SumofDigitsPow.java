// Problem 16
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/LettersUsed.java
// 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
// What is the sum of the digits of the number 2^1000?

import java.math.BigInteger;
public class SumofDigitsPow {
    public static void main(String[] args) {
        //2(2^1000)
        String temp = BigInteger.ONE.shiftLeft(1000).toString();
        int sum = 0;
        for(int i=0;i<temp.length();i++){
            sum+= temp.charAt(i) - '0';
        }
        System.out.println(Integer.toString(sum));
    }
}