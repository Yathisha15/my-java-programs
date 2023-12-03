public class xPowernRecursion {

    public static int calcPower(int n,int x){
        if(n == 0){
            return 1 ;
        }
        if(x == 0){
            return 0;
        }
         //if even 
         if(n%2 == 0){
            return calcPower(n/2, x)*calcPower(n/2, x);
         }else{
            return calcPower(n/2, x)*calcPower(n/2, x)*x;
         }
    }
    public static void main(String args[]){
        int x = 2 , n = 5;
        int ans = calcPower(n,x);
        System.out.println(ans);
    }
}
