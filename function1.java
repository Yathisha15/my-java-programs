import java.util.*;
public class function1 {
    public static void factorial(int n){
        if(n<=0){
            System.out.println("negative numbers and zero are invalid ");
            return;
        }
        else{
            int factorial = 1;
            for(int i=n;i>=1;i--){
                factorial = factorial*i;
                
            }
            System.out.println(factorial);
                return;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);
    }
}
