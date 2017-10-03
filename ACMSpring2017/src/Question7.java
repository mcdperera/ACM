
import java.util.ArrayList;
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
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String strArray[] = str.split(" ");

        int fir = Integer.parseInt(strArray[0]);
        int sec = Integer.parseInt(strArray[1]);

        ArrayList<Integer> primes = new ArrayList<>();

        int num = 0;
        for (int i = fir; i <= sec; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primes.add(i);// = primeNumbers + i + " ";
            }
        }

        int exactGap = 0;

        for (int i = 0; i < primes.size()-1; i++) {

            int gap = primes.get(i + 1) - primes.get(i);

            if (gap > exactGap) {

                exactGap = primes.get(i + 1) - primes.get(i);

            }

        }

//        double tol = Double.parseDouble(strArray[1]);
//
//        int size = Integer.parseInt(strArray[2]);
//
//        double[] anArray = new double[size];
//
//        for (int i = 0; i < size; i++) {
//            anArray[i] = Double.parseDouble(strArray[3 + i]);
//        }
//
//        double passCount = 0;
//
//        for (int i = 0; i < anArray.length; i++) {
//
//            Double val = anArray[i];
//
//            Double valMinus = val - firstNo;
//            Double valPlus = firstNo - val;
//            if (valMinus > tol) {
//                passCount++;
//
//            } else if (valPlus > tol) {
//                passCount++;
//
//            }
//
//        }
//
//        if ((passCount / anArray.length) > 0.25) {
//            System.out.println("true");
//        } else {
        System.out.println(exactGap);
        //}

    }

}
