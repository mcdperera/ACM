
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 502759576
 */
public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        if (0 <= no && no <= 50) {

            String str = sc.nextLine();

            String strArray[] = str.split(" ");

            int max = 0;
            for (String st : strArray) {

                if (max < st.length()) {
                    max = st.length();
                }
            }

            for (String st : strArray) {

                int red =  max - st.length();
                                
                for (int i = 0; i < red; i++) {
                     System.out.print(" ");
                }
       
                System.out.print( st + " ");

                char[] charArray = st.toCharArray();

                for (int i = charArray.length - 1; i >= 0; i--) {
                    System.out.print(charArray[i]);
                }

                System.out.print("\n");
            }

        } else {
            System.out.println("Input is out of range");
        }
    }
}
