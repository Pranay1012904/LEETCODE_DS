package Operation.Arrays;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args){
       int[] nums=new int[]{0,0,1,1,1,2,2,3,3,4};
       Integer[] newNums= Arrays.stream(nums).boxed().toArray(Integer[]::new);
       List<Integer> unique= Arrays.stream(newNums).distinct().toList();
       for(int i=0;i<unique.size();i++) {
            nums[i]= unique.get(i);
       }
       System.out.print(Arrays.toString(nums));
        System.out.print("Total Unique Elements:"+unique.size());
       }
    }

