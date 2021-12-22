
package problem7_findstring;

import java.util.Scanner;

public class Problem7_FindString {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter two strings ");
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        
        System.out.println("the total number of occurrences of the substring in the original string. "+ FindString(str1,str2));
        
    }
     public static int FindString(String str1 , String str2){
         int times = 0,  counter =0;
        
         for (int i=0; i< str1.length() ; i++){
            
             if (str1.charAt(i)==str2.charAt(0)){
                 counter++;
                for (int j=1 ; j<str2.length() ; j++){
                 if((i+j)<str1.length()){
                   if (str1.charAt(i+j)==str2.charAt(j))
                       counter++;
                    } 
                }
                   if (counter==str2.length()){  
                        times++;
                   }
            
            }
             counter = 0;
        }
        return times;
                
        

}
}
