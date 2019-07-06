import java.util.*;

public class NobleInteger{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        int size = in.nextInt();
        for(int i =0; i<size; i++){
            list.add(in.nextInt());
        }

        Collections.sort(list);

        int res = 0;

        for(int i =0; i<list.size(); i++){
            if(i<list.size()-1 && list.get(i)==list.get(i+1)){
                continue;
            }

            if(list.size()-1-i == list.get(i)){
                res = 1;
                break;
            }
        }

        if(res ==1){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

    }
}