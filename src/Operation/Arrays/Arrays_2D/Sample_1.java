package Operation.Arrays.Arrays_2D;

import java.util.Arrays;

public class Sample_1 {

    static public void main(String[] args){
        int[][] arr=new int[2][2];
        arr[0][0]=5; arr[0][1]=10; arr[1][0]=7; arr[1][1]=9;
        System.out.print("\n2D-ARRAY:-\n"+ Arrays.deepToString(arr));
    }
}
