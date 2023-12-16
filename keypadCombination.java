import java.util.HashSet;
import java.util.*;
public class keypadCombination {
    public static String keypad[] = {"." , "abc" , "def" ,"ghi" , "jkl" , "mno" , "pqr" , "stu" , "vwx" , "yz"};

    public static void printComb(String str,int idx,String combination){
        if(idx == str.length()) {
            System.out.println(combination);
            return ;
        }

        char currChar = str.charAt(idx) ;
        String mapping = keypad[currChar - '0'] ;

        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number you want to print:");

        String str = sc.next();

        // String str = "23" ;
        printComb(str,0,"");
    }
}
