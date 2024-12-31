package Operation.StringOps;

public class Valid_Palindrome {

    public static void main(String[] args){
        String s="race a car";
        char[] sArr= s.toLowerCase().toCharArray();
        StringBuilder sb=new StringBuilder();
        int ascii=0;
        for(char i: sArr){
            ascii=i;
            if((ascii>=48 && ascii<=57) || (ascii>=97 && ascii<=122)) sb.append(i);
        }
           String sbSt=sb.toString();
           String sbRev=sb.reverse().toString();
           //be careful while using StringBuilder. If you reverse it sb.reverse.
        // It's value will get reverserd everywhere!
        System.out.print(sbRev.equals(sbSt));
    }
}
