import java.util.*;
public class moveAllXToEnd {
    public static void moveAllX(String str , int idx , int count , String newString , String element){
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newString += element ;
            }
            System.out.println(newString);
            return ;
        }

        char currChar = str.charAt(idx);
        char currChar2 = element.charAt(0);
        if(currChar == currChar2){
            count ++ ;
            moveAllX(str, idx+1, count, newString,element);
        } else {
            newString += currChar ;
            moveAllX(str, idx+1, count, newString,element);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to move the elements to the end");
        String str = sc.next();
        System.out.println("enter the element you want to move to the last ");
        String element = sc.next();
        moveAllX(str,0,0,"",element);
    }
}
