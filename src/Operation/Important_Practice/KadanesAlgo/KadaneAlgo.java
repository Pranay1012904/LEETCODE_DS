package Operation.Important_Practice.KadanesAlgo;

public class KadaneAlgo {
    //-2,1,-3,4,-1,2,1,-5,4//-2,1,-3,4,-1,2,1,-5,4
    //5,4,-1,7,8
    //
    static final int [] nums={-2,1,-3,4,-1,2,1,-5,4};

    public static void main(String[] args){
     System.out.print(Kadane(nums));
    }

    public static int Kadane(int[] nums){
        int sum=0; int maxi=Integer.MIN_VALUE;// take maxi as Integer.MIN_VALUE for cases like [-10,-3,-5,-2,-6]

        for(int i=0;i<nums.length;i++){
             sum+=nums[i];
             maxi=Math.max(maxi,sum);
             if(sum<0) sum=0;
        }
        return maxi;
    }
}
