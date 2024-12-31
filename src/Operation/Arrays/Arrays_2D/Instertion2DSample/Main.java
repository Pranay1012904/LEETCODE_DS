package Operation.Arrays.Arrays_2D.Instertion2DSample;

import java.util.Arrays;

public class Main {

    public static void main(String args[]){
        Insertion.initialization();
        Insertion.insertion(0,1,10);
        Insertion.insertion(3,1,10);
        Insertion.insertion(0,1,10);

        System.out.print("\n\n"+ Arrays.deepToString(Insertion.arr));
    }
}
