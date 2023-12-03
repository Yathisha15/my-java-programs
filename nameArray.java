import java.util.*;
public class nameArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String names[] = new String[x];
        for(int i=0;i<x;i++){
            names[i] = sc.next();

        }
        for(int i=0;i<=names.length;i++){
            System.out.println(names[i]);
        }

    }
}
