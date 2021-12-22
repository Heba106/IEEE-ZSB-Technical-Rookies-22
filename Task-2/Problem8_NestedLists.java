
package problem8_nestedlists;

import java.util.Scanner;
public class Problem8_NestedLists {

    
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       int num = sc.nextInt(); 
       Scanner str= new Scanner (System.in);
       String[] names =new String[num];
       double[] grades =new double[num];
       for (int i=0; i<grades.length ; i++){
           names[i]= str.nextLine(); 
           grades[i]= sc.nextDouble(); 
       }
      System.out.println(SecondLowest(grades));
      for (int i=0; i<grades.length ; i++){
          if (grades[i]==SecondLowest(grades)){
              System.out.println(names[i]);
          }
      }
    }
    public static double SecondLowest(double grades[]){
        double min=grades[0], seconed=grades[0];
        for(int i=1; i<grades.length ; i++){
            if(grades[i]<min)  min=grades[i];
        }
        for(int i=1; i<grades.length ; i++){
            if(grades[i]<seconed && min<grades[i])  seconed=grades[i];
        }
            return seconed;

    }
}
