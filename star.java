import java.util.*;
public class star{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("the first number is " + a);
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("the second number is " + b);
        int result = a*b;
        System.out.println("the multiplication result of first and second number is " + a*b);
    }
}