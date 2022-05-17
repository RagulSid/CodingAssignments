//  Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, 
// the first 10 terms will be:
// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

// By considering the terms in the Fibonacci sequence whose values do not exceed
// four million, find the sum of the even-valued terms.


public class EvenFibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, temp = 0, res = 0;
        while(a <= 4000000){
            temp = a;        
            a = b;
            b += temp;

            if( b%2 == 0){    //checking for even
                res += b;
            }
        }
        System.out.println(res);
    }
    
}