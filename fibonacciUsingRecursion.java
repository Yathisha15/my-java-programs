import java.util.*;
public class fibonacciUsingRecursion {

    public static void printFibonacci(int a,int b,int n){
        if(n == 0){
            return ;
        }

        int c = a+b ;
        System.out.println(c);
        printFibonacci(b, c, n-1);
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;

        System.out.println("enter the value: ");

        int n = sc.nextInt() ;
        
        System.out.println(a);
        System.out.println(b);


        printFibonacci(a,b,n-2);
    }
}
