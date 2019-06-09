import java.util.*;

public class PalindromeInteger{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = Integer.toString(n);
        String revS = "";
        for(int i=s.length()-1; i>=0; i--){
            revS+=s.charAt(i);
        }
        if(s.equals(revS)){System.out.println("TRUE");}
        else{System.out.println("FALSE");}
    }
}