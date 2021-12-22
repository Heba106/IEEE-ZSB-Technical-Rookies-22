
package problem1_palindrome;

import java.util.Scanner;  
public class Problem1_palindrome {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string ");
        String str= sc.nextLine();
        System.out.println("IsPalindrome "+ IsPalindrome(str));
        
    }
     public static boolean IsPalindrome(String str)
    {
        boolean flag =true;
        str = str.toLowerCase();  
         for (int i=0; i< str.length(); i++)
            {
                 if (str.charAt(i)!= (str.charAt(str.length()-i-1)))
                 {
                    flag  = false;
                    break;  
                 }

            }
            
            return flag;
    }
}

