import java.util.Scanner;
import java.util.*;

public class PascalTriangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numRows = in.nextInt();

        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> prevList = new ArrayList<Integer>();
        
        for(int i=1; i<=numRows; i++){

            ArrayList<Integer> tempList = new ArrayList<Integer>();
        
            if(i==1)
            {
                prevList.add(1);
                resultList.add(prevList);
            }
            else
            {
                tempList.add(1);
                for(int j = 1; j<prevList.size(); j++)
                {
                    tempList.add(prevList.get(j) + prevList.get(j-1));
                }
                tempList.add(1);
                resultList.add(tempList);
                prevList = tempList;
            }
        }

        System.out.println(resultList);
    }
}