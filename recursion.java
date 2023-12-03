import java.util.*;

public class recursion {

    public static int printFactorial(int n){
        if(n == 1 || n == 0){
            return 1 ;
        }

        int factorial_nm1 = printFactorial(n-1);
        int factorial = factorial_nm1 * n ;
        return factorial ;
    }

    public static void main(String args[]){
        
       int res = printFactorial(5);

       System.out.println(res);
    }

   }
