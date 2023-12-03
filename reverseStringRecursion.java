import java.util.*;
public class reverseStringRecursion {

    public static void printRev(String str , int x){
        if(x == 0){
            System.out.println(str.charAt(x));
            return;
        }

        System.out.println(str.charAt(x));
        printRev(str, x-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to reverse");
        String str = sc.nextLine();
        // String str = "yathisha" ;
        printRev(str,str.length()-1);
    }
}
