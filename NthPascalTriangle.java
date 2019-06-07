import java.util.Scanner;
import java.util.*;

public class NthPascalTriangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int r = 0; r<=n; r++){
            list.add(Com(n,r));
        }
        System.out.println(list);
    }

    public static int Com(int n, int r){
        
        int result = 0;
        if(r==0 || r==n){
            return 1;
        }
        else
        {
            result = Com(n-1,r-1) + Com(n-1,r);
           // System.out.println(result);
        }
        
        return result;
    }
}