package Operation.StringOps;

public class PalindromeNumber {

    public static void isPalindrome(int x){
        String test=String.valueOf(x);
        System.out.print(String.format("\n\nThe Number: %d , Palindrome:%s",x,String.valueOf(checkForPalindromeNumber(test))));
    }

    public static boolean checkForPalindromeNumber(String test){
        int i=0; int l=test.length()-1;
        int m=i+l/2;
        boolean flag=true;
        while(i<=m && l>=m && flag){
            if(!(test.charAt(i)==test.charAt(l))){
                flag=false;
            }
            i++;l--;
        }
        return flag;
    }
}
