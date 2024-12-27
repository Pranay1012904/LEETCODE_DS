package Operation.Arrays;

import java.util.Arrays;
import java.util.List;

public class FindMiddleIndexDeclarative {

    public static void main(String[] args){
        int[] nums= new int[]{1,-1,4};
        FindMiddleIndexDeclarative findMiddleIndex=new FindMiddleIndexDeclarative();
        findMiddleIndex.findMiddleIndex(nums);
    }

    public void findMiddleIndex(int[] nums) {
        Integer[] newNums= Arrays.stream(nums).boxed().toArray(Integer[]::new);
        if(newNums.length==1)
            System.out.print(0);
        else{
            System.out.print(findThatSucker(newNums));
        }

    }

    private int findThatSucker(Integer[] nums){

        int mi=0;
        int ls=0;
        int rs=0;
        while(mi<nums.length){
            if(mi==nums.length-1){
                rs=0;
                ls=findls(Arrays.copyOfRange(nums,0,mi));
                if(ls==rs)
                    return mi;

            }
            else if(mi==0){
                ls=0;
                rs=findrs(Arrays.copyOfRange(nums,mi+1,nums.length));
                if(ls==rs)
                    return mi;
            }else{
                ls=findls(Arrays.copyOfRange(nums,0,mi));
                rs=findrs(Arrays.copyOfRange(nums,mi+1,nums.length));
                if(ls==rs)
                    return mi;
            }
            mi++;
        }
        return -1;
    }
    private int findls(Integer[] nums){
        List<Integer> integerList=Arrays.asList(nums);
        return integerList.stream().reduce(0,(a,b)->a+b);
    }

    private int findrs(Integer[] nums){
        List<Integer> integerList=Arrays.asList(nums);
        return integerList.stream().reduce(0,(a,b)->a+b);

    }
}
