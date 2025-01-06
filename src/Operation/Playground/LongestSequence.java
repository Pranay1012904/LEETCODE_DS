package Operation.Playground;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {

    static int[] arr={3,9,2,7,1,10,8,21,9,7,4,5};

    public static void main(String[] args){
        longestSeq();
    }

    private static void longestSeq(){
        Set<Integer> hashSet=new HashSet<>();

        for(int i: arr){
            hashSet.add(i);
        }
        int maxSeq=0;
        for(int i=0;i< hashSet.size();i++){
            boolean flag=true;
            int num=arr[i];
            int currSeq=1;

            while(flag){
                if(hashSet.contains(num-1)){
                    num-=1;
                }else{
                    flag=false;
                        while(hashSet.contains(num+1)){
                            currSeq++;
                            num++;
                        }
                }
            }
            if(currSeq>maxSeq) maxSeq=currSeq;
        }
        System.out.print("\nEnter Max Sequence"+maxSeq);
    }
}
