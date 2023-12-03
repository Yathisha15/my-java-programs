import java.util.*;
public class searchANumberInAMAtrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("enter the number of columns");
        int cols = sc.nextInt();
        int numbers [] [] = new int [rows] [cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("enter the element you want at the position "+ i + "  "+ j+".");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the number you want to search in the matrix:");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j] == x){
                    System.out.println("x found at the location " + i + " " + j +".");
                }
            }
        }
        System.out.println("thanks for using our service.");
    }
}
