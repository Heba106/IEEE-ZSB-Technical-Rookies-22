
package problem_1;
import java.util.Scanner;
public class Problem_1 {


    public static void main(String[] args) {
    System.out.println("Enter the length and the width of rectangle");
        Scanner sc=new Scanner(System.in);  
        int L =sc.nextInt();   
        int W =sc.nextInt(); 
        System.out.println("The area  equals "+ (L*W) );
        System.out.println("The parameter equals " + (2*(L+W)));
    }
    
}
