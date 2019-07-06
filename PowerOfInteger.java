import java.util.*;
import java.lang.Math.*;


public class PowerOfInteger{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int res=0;
        for(int a = 2; a<num ;a++){
            for(int p = 2; ;p++){
                //System.out.println("a^p -->" + a + p + " is --> " + Math.pow(a,p));
                if(Math.pow(a,p)==num){
                    res = 1;
                    break;
                }else if(Math.pow(a,p)>num){
                    break;
                }
            }
            if(res ==1){
                break;
            }else{
                continue;
            }
        }

        if(res==1){
            System.out.println("FOUND");
        }else{
            System.out.println("NOT FOUND");
        }
    }
}