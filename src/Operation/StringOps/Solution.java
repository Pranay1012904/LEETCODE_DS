package Operation.StringOps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

     boolean flag=true;

    public static void main(String[] args){
        Solution ss=new Solution();
        System.out.print(ss.wordPattern("abab","dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {

        if(!(Arrays.asList(pattern.split("")).size() == Arrays.asList(s.split(" ")).size()))
            flag =false;
        if(flag){
            testSymmetry(pattern,s);
        }

        if(flag){
            matchPattern(pattern,s);
        }

        if(flag){
            testBijectional(pattern,s);
        }
        return flag;
    }

    public void matchPattern(String pattern, String s){

        if (Arrays.asList(pattern.split("")).stream()
                .distinct().count() == Arrays.asList(s.split(" "))
                .stream().distinct().count()){
            flag = true;
        }else
            flag=false;
    }

    public void testSymmetry(String pattern, String s){
        int sym=0;
        List<String> pList= Arrays.asList(pattern.split(""));
        List<String> sList= Arrays.asList(s.split(" "));
        while(sym<pList.size()-1){
            boolean b1= pList.get(sym).equals(pList.get(sym+1));
            boolean b2= sList.get(sym).equals(sList.get(sym+1));
            if(!(b1==b2)){
                flag=false;
                break;
            }
            sym++;
        }
    }

    public void testBijectional(String pattern, String s){
        List<String> pList= Arrays.asList(pattern.split(""));
        List<String> sList= Arrays.asList(s.split(" "));
        List<String> dp= pList.stream().distinct().toList();
        List<String> ds= sList.stream().distinct().toList();

        int a= Collections.frequency(pList,dp);
        int[] frp=new int[dp.size()];
        int[] frs=new int[dp.size()];

        for(int i=0; i<dp.size(); i++){
            frp[i]=Collections.frequency(pList,dp.get(i));
        }
        for(int i=0;i<ds.size();i++){
            frs[i]=Collections.frequency(sList,ds.get(i));
        }
        if(!(Arrays.toString(frp).equals(Arrays.toString(frs)))){
            flag= false;
        }

    }
}
