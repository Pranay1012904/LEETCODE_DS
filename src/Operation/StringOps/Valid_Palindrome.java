package Operation.StringOps;
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

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
           //be careful while using StringBuilder. If you reverse it sb.reverse().
        // It's value will get reverserd everywhere! sb itself will get reverserd, it wont return a reversed value
        System.out.print(sbRev.equals(sbSt));
    }
}
