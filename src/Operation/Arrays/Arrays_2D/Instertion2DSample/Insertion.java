package Operation.Arrays.Arrays_2D.Instertion2DSample;

import java.util.logging.Logger;

public class Insertion {
    static int[][] arr = new int[2][2];

    static Logger logger=Logger.getLogger(Insertion.class.getSimpleName());
    public static void initialization(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                Insertion.arr[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    public static void insertion(int r, int c, int val){

        try{
            if(arr[r][c]== Integer.MIN_VALUE) {
                arr[r][c] = val;
                logger.info(String.format("Insertion of %d successful!",val));
            }else{
                logger.info(String.format("Insertion Failed, Cell Occupied!"));
            }

        }catch(Exception e){
            logger.severe("Insertion Failed :: ERROR ::"+e.getMessage());
        }finally{
            logger.info("Operation completed!");
        }
    }
}
