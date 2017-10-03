
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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] charArray = s.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
        }

        System.out.println("\n Question1 complete");
    }

}
