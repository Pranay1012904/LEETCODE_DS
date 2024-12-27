package Operation.Arrays.AVGTEMP;

public class Average {

    public static void calculateAvgTemp(int[] temp){
        float sum=0f;
        for (int j : temp) {
            sum += j;
        }
        sum=sum/temp.length;
        System.out.print("\nAverage Temperature for "+temp.length+" days is::"+(sum));
        DaysAbvAvg.daysAbvAvg(temp,sum);
    }
}
