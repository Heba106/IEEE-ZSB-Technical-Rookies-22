
package problem4_distance;

import java.util.Scanner;

public class Problem4_distance {

    public static void main(String[] args) {
       System.out.println("Enter array length");
      Scanner sc = new Scanner(System.in);  
      int L =sc.nextInt();  
      int arr[]=new int[L];
      System.out.println("Enter array find the minmum ditance");
      for (int i=0; i<arr.length ; i++){
          arr[i]=sc.nextInt();  
      }
      
    System.out.println(Distance(arr));
    }
    
    public static int Distance(int[]arr){
        Integer min = Integer.MAX_VALUE;
        int diff=0;
        for(int i=0; i<arr.length;i++){
            for (int j=i+1;j<arr.length; j++)
                if (arr[i]==arr[j]) diff= j-i; 
            
            if(diff<min) min=diff;
        }
        return min;
    }
}
