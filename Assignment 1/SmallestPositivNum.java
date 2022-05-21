// Problem 5
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/Diff_SumofSquares.java
// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10
// without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers
// from 1 to 20

public class SmallestPositivNum {

    public static boolean isDivisible(int n){
        for (int i = 1; i <= 20 ; i++) {     //we can also start from 11
            if(n%i !=0 ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 1;
        while(!isDivisible(num)){
            num+=1;
        }
        System.out.println(num);
    }
    
}