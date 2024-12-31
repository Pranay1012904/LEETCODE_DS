package Operation.StringOps;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddBinaryProblem {

    public static void main(String[] args){
      System.out.print(addBinary(
              "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
              "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
      ));
    }

    public static String addBinary(String a, String b) {
        Long intA= getDecimal(a);
        Long intB= getDecimal(b);
        BigInteger sum=BigInteger.valueOf(intA + intB);

        return decimalToBinary(sum);
    }


    private static Long getDecimal(String v){
        char[] binaryArr=v.toCharArray();
        Long sum=0L;
        Long pow=0L;
        for(int i=binaryArr.length-1;i>=0;i--){
            sum+=  Long.parseLong(String.valueOf(binaryArr[i]))*(long) Math.pow(2,pow);///(((int)binaryArr[i])*Math.pow(2,pow));
            pow++;
        }

        return sum;
    }

    public static String decimalToBinary(BigInteger d){
        List<BigInteger> binList=new ArrayList<>();

        while(!d.equals(BigInteger.valueOf(1))){

            binList.add(d.remainder(BigInteger.valueOf(2)));
            d=d.divide(BigInteger.valueOf(2));
            if(d.equals(1))
                binList.add(d);
        }
        String bString="";
        for(int i=binList.size()-1;i>=0;i--){
            bString=bString.concat(String.valueOf(binList.get(i)));
        }
        return bString;
    }
    //1011101000101011001000011011000001100011110011010010010111100000
    //110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000

    /* The Real Sol_n
     StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }

    private static Long getDecimal(String v){
        char[] binaryArr=v.toCharArray();
        Long sum=0L;
        Long pow=0L;
        for(int i=binaryArr.length-1;i>=0;i--){
             //sum+= (int)(Integer.valueOf(binaryArr[i])*Math.pow(2,pow));
             sum+= (Long.parseLong(String.valueOf(binaryArr[i]))*(long)Math.pow(2,pow));
             pow++;
        }
        return sum;
     */
}
