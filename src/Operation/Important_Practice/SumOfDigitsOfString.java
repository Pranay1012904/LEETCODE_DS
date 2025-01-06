package Operation.Important_Practice;

public class SumOfDigitsOfString {
    static public void main(String[] args){
      System.out.print(  getLucky("leetcode",2));
    }

    public static int getLucky(String s, int k) {
        int n=0;

        String num="";
        for(int i=0;i<s.length();i++){
            n= s.charAt(i);
            num=num.concat(String.valueOf(n-96));
        }


        for(int i=0;i<k;i++){
            n=0;
            for(int j=0;j<num.length();j++){
                n+=(num.charAt(j)-'0');
            }

            num=String.valueOf(n);
        }
        return n;
    }

}
