import java.util.*;
public class totalPath {
    public static int countPaths(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0 ;
        }
        if(i==n-1 && j==m-1){
            return 1 ;

        }
        int downPaths = countPaths(i+1, j, n, m);

        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths ;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of paths to which you have to find the number of paths");
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int n=3 , m=4 ;
        int totalPaths = countPaths(0,0,n,m);
        System.out.println("the total number of paths are: " + totalPaths);
    }
}