package Operation.Important_Practice.IsUnique_217;
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

public class BruteForce {

    public static void main(String[] args){
        containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
    }
    //O(n^2)
    public static boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        int i=0; int j;
        while(!flag && i<nums.length-1){
            j=i+1;
            while(!flag && j<nums.length){
                if(nums[i]==nums[j]) flag= true;
                j++;
            }
            i++;
        }
        return flag;
    }

    //O(n)
    public static boolean containsDuplicateOptimal(int[] nums) {
            boolean flag=false;
            int i=0; int j;
            while(!flag && i<nums.length-1){
                j=i+1;
                while(!flag && j<nums.length){
                    if(nums[i]==nums[j]) flag= true;
                    j++;
                }
                i++;
            }
            return flag;
    }
}
