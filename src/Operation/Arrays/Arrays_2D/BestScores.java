package Operation.Arrays.Arrays_2D;

import java.util.Arrays;
import java.util.List;

public class BestScores {

    public static void main(String[] args){
        int[] array=new int[]{84,85,86,87,85,90,85,83,23,45,84,1,2,0};
       System.out.print(Arrays.toString(findTopTwoScores(array)));
    }
    public static int[] findTopTwoScores(int[] array){

        Integer[] intArray= Arrays.stream(array).boxed().toArray(Integer[]::new);
        List<Integer> iList=Arrays.asList(intArray);
        List<Integer> sortedList=iList.stream().sorted().toList();
        int[] bestScores=new int[]{sortedList.get(sortedList.size()-2),sortedList.get(sortedList.size()-1)};
        return bestScores;
    }
}
