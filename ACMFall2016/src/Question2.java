
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
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] arr = str.split(" ");

        int maxSize = 0;

        for (String arr1 : arr) {
            if (maxSize < arr1.length()) {
                maxSize = arr1.length();
            }
        }

        for (int i = maxSize - 1; i >= 0; i--) {

            for (String arr1 : arr) {

                char[] charArray = arr1.toCharArray();

                if (charArray.length > i) {
                    System.out.print(charArray[i]);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }

    }

}
