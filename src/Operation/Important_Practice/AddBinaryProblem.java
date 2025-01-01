package Operation.Important_Practice;

public class AddBinaryProblem {

    public static void main(String[] args){
      System.out.print(addBinary(
              "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
              "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
      ));
    }

    public static String addBinary(String a, String b) {
       int al=a.length()-1;
       int bl=b.length()-1;
       int carry=0;
       StringBuilder res=new StringBuilder();
       while(al>=0 || bl>=0){
           int sum=carry;
        if(al>=0)  sum+= a.charAt(al--)-'0';
        if(bl>=0)   sum+= b.charAt(bl--)-'0';
        carry=sum>1?1:0;
        res.append(sum%2);
       }
       if(carry!=0) res.append(carry);

       return res.reverse().toString();
    }
}
