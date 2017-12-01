
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Charmal
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
             System.out.println(charArray[i]);
        }

        System.out.println("\n Question1 complete");
    }

}
