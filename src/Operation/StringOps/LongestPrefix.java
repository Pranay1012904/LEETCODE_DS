package Operation.StringOps;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestPrefix {

    static public void main(String[] args) {
        String[] strs = new String[]{"c","acc"};
        List<String> str = Arrays.asList(strs);

        int smallest= shortestString(str);
        int i = 1;

        boolean flag = true;
        String pre="";
        while (i <= smallest && flag) {
            String sub = str.get(0).substring(0,i);
            int j = 1;
            while (j < str.size()) {
                if (!(sub.charAt(i-1)==str.get(j).charAt(i-1))) {
                    flag = false;
                    break;
                }
                j++;
            }
            if(flag)
                pre=pre.concat(String.valueOf(sub.charAt(i-1)));
            i++;
        }
        System.out.print(pre);

    }

    public static int shortestString(List<String> strs){

        AtomicInteger s = new AtomicInteger();
        s.set(500);
        strs.stream().map(String::length).forEach(l -> {
            if (l < s.get())
                s.set(l);
        });

        return(s.get());

    }
}

