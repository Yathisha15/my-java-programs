import java.util.*;
public class practice {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=1;i<=number.length;i++){
            if(number[i]==x){
                System.out.println("The number is present at"+ i);
            }
        }
        
   }
}

