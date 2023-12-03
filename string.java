import java.util.*;
public class string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();

        String fullName = firstName + lastName ;
         
        System.out.println("your full name is "+ fullName);
        System.out.println("your name contains " + fullName.length() + " letters.");
        System.out.println(fullName.charAt(5));

        if(firstName.compareTo(lastName)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
    }
}
