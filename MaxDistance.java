import java.util.*;

public class MaxDistance{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

            int size = in.nextInt();
            int[] a = new int[size];

            for(int i=0; i<size; i++){
                a[i] = in.nextInt();
            }

            int max = -1;

            for(int i =0; i<a.length; i++){
                for(int j=i+1; j<size; j++){
                    if(a[i]<=a[j]){
                        int sub = j -i;
                        if(max<sub){
                            max = sub;
                        }
                    }
                }
            }

            System.out.println(max);
    }
}