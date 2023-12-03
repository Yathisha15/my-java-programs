import java.util.*;
public class factorailRecursion {

    public static int calcFactorial(int n){
        if(n == 1 || n == 0){
            return 1 ;
        }

        int calc_nm1 = calcFactorial(n-1);
        int fact = calc_nm1 * n ;
        return fact ;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to calculate the factorial: ");
        int n = sc.nextInt();

        int ans = calcFactorial(n);
        System.out.println(ans);
    }
}
