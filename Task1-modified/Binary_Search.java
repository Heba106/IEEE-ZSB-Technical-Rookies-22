
package binary_search;
import java.util.Scanner;  

public class Binary_Search {

    public static void main(String[] args) {
        int A []= {1,2,5,10,15,24,60,75,100};
        Scanner sc =new Scanner(System.in);  
        int key =sc.nextInt();  
        if (BinarySearch(A,0,A.length,key)==-1)
            System.out.println("not found");
        else System.out.printf("The number %d is found and its index is ",key,BinarySearch(A,0,A.length,key));  
        
    }
    
    public static int BinarySearch (int [] arr , int L , int H , int key ){
        if(L<=H){
           int mid = (L+H)/2;
           if (key==arr[mid]) 
               return mid;
           if (key>arr[mid])
               return BinarySearch (arr,mid+1,H,key);
           return BinarySearch(arr,L,mid-1,key);
           
        }
        else 
            return -1;
    }
}
    
