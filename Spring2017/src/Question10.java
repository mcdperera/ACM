
import java.util.ArrayList;
import java.util.Arrays;
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
public class Question10 {

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

        StringBuilder fA = new StringBuilder();
        StringBuilder sA = new StringBuilder();

        Arrays.sort(anArray);

        ArrayList<Integer> secArray = new ArrayList<>();

        //int[] secArray = new int[size];
        int zeroCout = 0;
        int nextInt = 0;
        for (int i = 0; i < anArray.length; i++) {

            if (anArray[i] == 0) {
                zeroCout++;
            } else if (nextInt < 2) {
                secArray.add(anArray[i]);

                nextInt++;
            } else {
                for (int j = 0; j < zeroCout; j++) {
                    secArray.add(0);
                }

                zeroCout = 0;

                secArray.add(anArray[i]);
            }

        }

        boolean first = true;
        int j = 0;
        for (int i = 0; i < secArray.size(); i++) {

            if (first) {
                fA.append(Integer.toString(secArray.get(i)));

                first = false;
            } else {
                sA.append(Integer.toString(secArray.get(i)));
                first = true;

                j++;
            }
        }

        int value = Integer.parseInt(fA.toString()) + Integer.parseInt(sA.toString());

        System.out.println(value);

    }

}
