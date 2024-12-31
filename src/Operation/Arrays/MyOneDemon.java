package Operation.Arrays;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyOneDemon {
    int[] arr=null;
    private static final Logger logger = Logger.getLogger(MyOneDemon.class.getName());
    public MyOneDemon(int size) {
        arr=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=Integer.MIN_VALUE;
    }

    public void insert(int location, int data){

        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = data;
                logger.log(Level.FINE,String.format("Value Inserted::%d",data));
            } else {
                logger.log(Level.INFO,String.format("Location %d Occupied!",location));
            }
        }catch(Exception e){
            logger.severe(String.format("ERROR::: %s IN CLASS::: %s",e.getMessage(),this.getClass().getSimpleName()));
        }
    }
}
