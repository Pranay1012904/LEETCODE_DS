package Operation.Important_Practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    static public void main(String[] args){
        String rm="MCMXCIV";
        int i=1;
        int sum=0;

        //Remember cfalling the function all the time eg:dictionary().get.... consumes lots of time
        if(rm.length()==1)
            sum+=dictionary().get(String.valueOf(rm.charAt(0)));
        else{
            while(i<=rm.length()){
                if(i==rm.length()) {
                    sum += dictionary().get(String.valueOf(rm.charAt(i - 1)));
                    i++;
                }
                else if(dictionary().get(String.valueOf(rm.charAt(i-1)))> dictionary().get(String.valueOf(rm.charAt(i)))){
                     sum+=dictionary().get(String.valueOf(rm.charAt(i-1)));
                      i++;
                }
                else if(dictionary().get(String.valueOf(rm.charAt(i-1)))< dictionary().get(String.valueOf(rm.charAt(i)))){
                        sum+=dictionary().get(String.valueOf(rm.charAt(i)))-dictionary().get(String.valueOf(rm.charAt(i-1)));
                    i+=2;
                }else if(dictionary().get(String.valueOf(rm.charAt(i-1))) == dictionary().get(String.valueOf(rm.charAt(i)))){
                    sum+=dictionary().get(String.valueOf(rm.charAt(i-1)));
                    i++;
                }
            }
        }
        System.out.print("\n\nSUM::"+sum);
    }

    public static Map<String, Integer> dictionary(){
        Map<String, Integer> dictionary=new HashMap<>();
        dictionary.put("I",1);
        dictionary.put("V",5);
        dictionary.put("X",10);
        dictionary.put("L",50);
        dictionary.put("C",100);
        dictionary.put("D",500);
        dictionary.put("M",1000);
        return dictionary;
    }

}
