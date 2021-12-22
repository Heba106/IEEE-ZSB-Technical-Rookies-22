
package problem6_runner.up;
import java.util.Scanner;

public class Problem6_RunnerUp {

    
    public static void main(String[] args) {
  System.out.println("Enter array length");
      Scanner sc = new Scanner(System.in);  
      int L =sc.nextInt();  
      int arr[]=new int[L];
      System.out.println("Enter array to be sorted");
      for (int i=0; i<arr.length ; i++){
          arr[i]=sc.nextInt();  
      }
       System.out.println("Runner-Up Score equals = "+ RunnerUp(arr));
    }

    public static int RunnerUp(int arr[]){
        int max=0, seconed=0;
        for(int i=0; i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
         for(int i=0; i<arr.length;i++){
            if (arr[i]>seconed && max>arr[i]) seconed=arr[i];
        }
        return seconed;
    }
     
}
