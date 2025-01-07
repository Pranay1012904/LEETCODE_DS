package Operation.Sorting_Algos;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args){
    //[7,1,5,3,6,4]
        int[] nums={7,1,2,3,4};
        bubbleSort(nums);
    }

    public static void bubbleSort(int[] nums){
            int a=1; int count;
        for(int i=a;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length-a;j++) {
                if (nums[j + 1] < nums[j]) {
                    nums[j + 1] += nums[j];
                    nums[j] = nums[j + 1] - nums[j];
                    nums[j + 1] -= nums[j];
                    count++;
                }
            }
            if(count==0) break;

            a++;
        }
        System.out.print("\n\n"+ Arrays.toString(nums));
    }
}
