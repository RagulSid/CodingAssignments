// Problem 1
// Next problem : https://github.com/RagulSid/CodingAssignments/blob/main/Assignment%201/EvenFibonacci.java
// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6
// and 9. The sum of these multiples is 23.

public class problem1 {
    public static void main(String[] args) {
        int total_sum = 0;
        for (int i = 0; i < 1000 ; i++) {
            if(i%3 == 0 || i%5 ==0 ){     //check both conditions
                total_sum += i;
            }
        }  
        System.out.println(total_sum); 
    }
}