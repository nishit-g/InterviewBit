import java.io.*; 
import java.util.*; 
import java.lang.Math.*;

public class InfiniteGrid{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        int size = in.nextInt();
        for(int i =0; i<size; i++){
            x.add(in.nextInt());
        }   
        for(int i =0; i<size; i++){
            y.add(in.nextInt());
        } 

        int count =0;

        for(int j = 0; j<x.size(); j++){
            count += Math.max(Math.abs(x.get(j)-x.get(j+1)) , Math.abs(y.get(j)-y.get(j+1)));
        }

        System.out.println(count);
        
    }
}