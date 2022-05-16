// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6
// and 9. The sum of these multiples is 23.


public class SumofMultiples {
    public static void main(String[] args) {
        int total_sum = 0;
        for (int i = 0; i < 1000 ; i++) {
            if(i%3 == 0 || i%5 ==0 ){
                total_sum += i;
            }
        }  
        System.out.println(total_sum); 
    }
}