
package problem9_diagonaldiff;

import java.util.Scanner;
public class Problem9_DiagonalDiff {
    
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       int num = sc.nextInt(); 
       int[][]arr = new int [num][num];
       for (int i=0; i<arr.length ; i++){
           for(int j=0; j<arr.length ; j++){
               arr[i][j]= sc.nextInt();
           }
       }
       for (int i=0; i<arr.length ; i++){
           for(int j=0; j<arr.length ; j++)
           System.out.print(arr[i][j]+" ");
           
        System.out.println("");
       }
       int primary=0, secondary=0;
        for (int i=0; i<arr.length ; i++){
            for(int j=0; j<arr.length ; j++){
                if(i==j) primary+=arr[i][j];
            }
        }
       
         for (int i=0; i<arr.length ; i++){
            for(int j=0; j<arr.length ; j++){
                if(i+j==arr.length-1) secondary+=arr[i][j];
            }
        }
          System.out.printf ("the absolute difference between the sums of diagonals equals %d \n", Math.abs(primary-secondary));
    }
}
