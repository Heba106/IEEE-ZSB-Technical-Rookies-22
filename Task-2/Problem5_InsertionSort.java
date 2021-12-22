
package problem5_insertionsort;
import java.util.Scanner;

public class Problem5_InsertionSort {

    public static void main(String[] args) {
       
      System.out.println("Enter array length");
      Scanner sc = new Scanner(System.in);  
      int L =sc.nextInt();  
      int arr[]=new int[L];
      System.out.println("Enter array to be sorted");
      for (int i=0; i<arr.length ; i++){
          arr[i]=sc.nextInt();  
      }
      IsertionSort(arr);
      System.out.print("[ ");
      for (int i=0; i<arr.length ; i++)
          System.out.print(arr[i]+" ");
      
      System.out.print("]");
        
    }
    public static int[] IsertionSort (int[] A){
        
        for (int i=1; i<A.length ; i++){
            int current=A[i];
            int j=i-1;
            while (j>=0 && A[j]>current){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=current;
        }
   
        return A;
    }
}
