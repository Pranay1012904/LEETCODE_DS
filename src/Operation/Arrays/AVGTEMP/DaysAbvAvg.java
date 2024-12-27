package Operation.Arrays.AVGTEMP;

import java.util.Arrays;
import java.util.List;

public class DaysAbvAvg {

    public static void daysAbvAvg(int[] temp, float avg){

        /*List<Integer> abv= Arrays.stream(temp)
                .boxed()
                .toList();*/
        int days=0;
        for(int t:temp){
            if(t>avg)
                days++;
        }
                System.out.print("\n\nDAY(S) ABOVE AVERAGE TEMPERATURE::"+days);
    }
}
