
package guessing_game;


import java.util.Scanner;
import java.util.Random;

class Guessing_Game {
    public static void main(String args[]) {
        int x = (int)(Math.random()*(11-1)+1);
        int counter =1;
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();        
        
        while(num != x){
            System.out.println("wrong guess");
            counter ++ ;
             num = sc.nextInt();
            }
        System.out.println("Yay you got it "+counter+" tries");

        
    }
}