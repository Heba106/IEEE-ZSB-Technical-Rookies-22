
package problem_7;
import java.util.Scanner;  


public class Problem_7 {

  
    public static void main(String[] args) {
       System.out.println("Enter a number the sum of the numbers from 1 to n");
        int n, sum=0;  
        Scanner sc=new Scanner(System.in);  
        n=sc.nextInt();   
        if(n>0){
            for(int i=1 ;i<=n;i++)
            if (i%3==0 || i%5==0)
            sum +=i;
        System.out.println("Sum = " + sum);
            
        }
    }
    
}
