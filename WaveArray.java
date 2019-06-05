import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class WaveArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = 4;
        for(int i =0; i<size; i++){
            list.add(in.nextInt());
        }
        wave(list);
        System.out.println(list);
    }
    public static ArrayList<Integer> wave(ArrayList<Integer> a) {
        Collections.sort(a);
        for(int i = 1; i<a.size(); i+=2){
            Collections.swap(a,i-1,i);
        }
        return a;
    }
}