package Operation.Arrays;

public class FindMaxMin {

    static public void main(String[] args){
        int[] prices=new int[]{7,1,5,3,6,4};
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>max) max=prices[i];
            if(prices[i]<min) min=prices[i];
        }

        System.out.print("\nMAX::"+max);
        System.out.print("\nMIN::"+min);

    }
}
