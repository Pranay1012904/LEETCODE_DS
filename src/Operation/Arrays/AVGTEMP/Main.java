package Operation.Arrays.AVGTEMP;

import java.util.Scanner;

public class Main {
    static int[] temp=null;
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        getDaysandTemp(s);
    }

    public static void getDaysandTemp(Scanner s){
     System.out.print("\nENTER NUMBER THE DAYS:");
     int size=s.nextInt();
     temp=new int[size];
     for(int i=0;i<size;i++){
         System.out.print(String.format("%nEnter Temperature For Day %d: ",i+1));
         temp[i]=s.nextInt();
     }
     Average.calculateAvgTemp(temp);
    }
}
