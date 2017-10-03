
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
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String strArray[] = str.split(" ");

        double firstNo = Double.parseDouble(strArray[0]);

        double tol = Double.parseDouble(strArray[1]);

        int size = Integer.parseInt(strArray[2]);

        double[] anArray = new double[size];

        for (int i = 0; i < size; i++) {
            anArray[i] = Double.parseDouble(strArray[3 + i]);
        }

        double passCount = 0;

        for (int i = 0; i < anArray.length; i++) {

            Double val = anArray[i];

            Double valMinus = val - firstNo;
            Double valPlus = firstNo - val;
            if (valMinus > tol) {
                passCount++;

            } else if (valPlus > tol) {
                passCount++;

            }

        }

        if ((passCount / anArray.length) > 0.25) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
