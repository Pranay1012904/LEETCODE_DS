package Operation.Arrays;

import java.util.ArrayList;
import java.util.List;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */
//If you create a IntegerList out of int array using Assays.asList(arr)
//You Wont be able to add and int value to the list eg intList.add(5)------- illegal operation!
//so create a List<Integer> the add values from arr one by one using for(int i: arr)
public class SerachInsertionPosition_Sol2 {

    static public void main(String[] args){
        int[] nums=new int[]{1,3,5,6};
        int target=5;
        List<Integer> modNums=new ArrayList<>();
        for(int i: nums){
            modNums.add(i);
        }
        modNums.add(target);
        System.out.print(getTheSortedList(modNums,target));
    }

    public static int getTheSortedList(List<Integer> nums,int target){
        List<Integer> sortedList = nums.stream().sorted().toList();
        return sortedList.indexOf(target);
    }
}
