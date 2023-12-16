import java.util.HashSet;

public class subsequences {
    public static void subSequences(String str,int idx,String newString,HashSet<String>set ){
        if(idx == str.length()){
            if(set.contains(newString)){
                return ;
            } else {
                System.out.println(newString);
                set.add(newString);
                return ;

            }
        }
        char currChar = str.charAt(idx);
        subSequences(str, idx+1, newString+currChar, set);

        subSequences(str, idx+1, newString, set);
    }
    public static void main(String args[]){
        String str = "abc" ;
        HashSet<String>set = new HashSet<>() ;
        subSequences(str,0,"",set);
    }
}
