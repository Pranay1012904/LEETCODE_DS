package Operation.StringOps;

import java.util.ArrayList;
import java.util.List;

public class CoolStringProb {
    static int cool=0;
    public static void extractSubstrings(String s){
        List<String> sList=new ArrayList<>();
        int pSubs=s.length()-3;
        for(int i=0; i<pSubs; i++){
            String sub="";
            for(int j=i;j<=i+3;j++){
                sub=sub.concat(String.valueOf(s.charAt(j)));

            }
            sList.add(sub);
        }
        System.out.print("\n\nLIST OF SUBSTRINGS : "+sList+"\n\nCool Strings:"+coolSubstrings(sList));
    }

    public static int coolSubstrings(List<String> sList){

        for(String s: sList){
            boolean flag=false;
            for(int i=0; i<s.length(); i++){
                if(s.substring(i+1,s.length()).contains(String.valueOf(s.charAt(i)))){
                    flag=true;
                }
            }
            if(!flag)
                cool++;
        }
        return cool;
    }
}
