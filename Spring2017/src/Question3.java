
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
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String strArray[] = str.split(" ");

        int size = Integer.parseInt(strArray[0]);

        int[] anArray = new int[size];

        for (int i = 0; i < size; i++) {
            anArray[i] = Integer.parseInt(strArray[i + 1]);
        }

        int j = size - 1;
        for (int i = 0; i < size - 1; i++) {

            if (anArray[i] != anArray[j]) {
                System.out.println("false");
                return;
            }

            j--;

        }

        System.out.println("true");


    }

}
