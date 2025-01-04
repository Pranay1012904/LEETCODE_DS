package Operation.Arrays;

public class FindSecondLargest {

    public static void main(String[] args){
        int []y={7,3,4,1,6,0,5};
        int max=Integer.MIN_VALUE;
        int diff=Integer.MAX_VALUE;
        int min2=0;
        for(int i=0;i<y.length;i++){
            if(y[i]>max){
                max=y[i];
                diff=max;
            }
            else if((max-y[i])<diff){
                diff=max-y[i];
                min2=y[i];
            }
        }
        System.out.print("\nMAX::"+max+"\tMAX-2::"+min2);
    }
}
