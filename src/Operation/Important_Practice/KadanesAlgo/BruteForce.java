package Operation.Important_Practice.KadanesAlgo;

import java.util.Arrays;

public class BruteForce {
    //-2,1,-3,4,-1,2,1,-5,4//-2,1,-3,4,-1,2,1,-5,4
    //5,4,-1,7,8
    //
   static final int [] nums={-2,1,-3,4,-1,2,1,-5,4};

   public static void main(String[] args){
       bruteForce();
   }
    //TC:O(n^2) //Kadane:O(N)
   private static void bruteForce(){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            int sum=0;
            for(int j=i;j< nums.length;j++){
                sum+=nums[j];
                if(sum>max) max=sum;
            }

        }
        System.out.print("\nMAXIMUM SUBARRAY::"+max);
   }
}
