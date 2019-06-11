import java.util.*;

public class ReverseInteger{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long num = in.nextLong();
        
        long res =0;
        int sign = (num>0)?1 : -1;

        num = Math.abs(num);
        while(num>0){
            res = res*10 + num%10;
            num /=10;
        }

        res *=sign;
        long as = (res<Integer.MIN_VALUE || res>Integer.MAX_VALUE)? 0 : res;

        System.out.println(as);
    }
}