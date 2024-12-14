package Operation.StringOps;

import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {


    static public void main(String[] args){
        String s= "   fly me   to   the moon  ";
        String[] sn1=s.trim().split(" ");
        List<String> sll=Arrays.asList(sn1).stream().filter(st-> !st.trim().isEmpty()).toList();
        System.out.print(sll.get(sll.size()-1).length());
    }
}
