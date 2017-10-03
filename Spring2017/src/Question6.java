
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
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String strArray[] = str.split(" ");

        int low = Integer.parseInt(strArray[0]);

        int up = Integer.parseInt(strArray[1]);

        int base = Integer.parseInt(strArray[2]);

        OUTER:
        for (int i = low; i <= up; i++) {

            char[] digitsAsChars = String.valueOf(i).toCharArray();

            int j = digitsAsChars.length - 1;

            boolean isFound = true;

            for (int k = 0; k <= digitsAsChars.length - 1; k++) {

                if (digitsAsChars[k] != digitsAsChars[j]) {
                    isFound = false;
                    break;
                }

                j--;

            }

            if (isFound) {

                String baseNo = Integer.toString(i, base);

                char[] baseNoAsChars = baseNo.toCharArray();

                int l = baseNoAsChars.length - 1;

                boolean isFoundBaseNo = true;

                for (int k = 0; k <= baseNoAsChars.length - 1; k++) {

                    if (baseNoAsChars[k] != baseNoAsChars[l]) {
                        isFoundBaseNo = false;
                        break;
                    }

                    l--;
                }

                if (isFoundBaseNo) {
                    System.out.println(i);
                }

            }

        }

    }

}
