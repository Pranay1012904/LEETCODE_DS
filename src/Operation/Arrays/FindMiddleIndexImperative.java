package Operation.Arrays;


//This Imperative Style gives far less complexity as compared to Declarative!

public class FindMiddleIndexImperative {

    public static void main(String[] args){
        int[] nums= new int[]{1,-1,4};
        FindMiddleIndexDeclarative findMiddleIndex=new FindMiddleIndexDeclarative();
        findMiddleIndex.findMiddleIndex(nums);
    }

    public int findMiddleIndex(int[] nums) {

        if(nums.length==1)
            return 0;
        else{
            return  findThatSucker(nums);
        }

    }

    private int findThatSucker(int[] nums){

        int mi=0;
        int ls=0;
        int rs=0;
        while(mi<nums.length){


            if(mi==nums.length-1){
                rs=0;
                ls=findls(nums,mi-1);
                if(ls==rs)
                    return mi;

            }
            else if(mi==0){
                ls=0;
                rs=findrs(nums, mi+1);
                if(ls==rs)
                    return mi;
            }else{
                ls=findls(nums,mi-1);
                rs=findrs(nums,mi+1);
                if(ls==rs)
                    return mi;
            }
            mi++;
        }
        return -1;
    }
    private int findls(int[] nums,int i){
        int ls=0;
        while(i>=0)
        {
            ls+=nums[i];
            i--;
        }
        return ls;
    }

    private int findrs(int[] nums,int i){
        int rs=0;
        while(i<nums.length)
        {
            rs+=nums[i];
            i++;
        }
        return rs;
    }
}
