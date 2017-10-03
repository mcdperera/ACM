
import java.util.ArrayList;
import java.util.HashMap;
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
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<Integer, Integer> hmap = new HashMap<>();

        /*Adding elements to HashMap*/
        hmap.put(0, 3);
        hmap.put(1, 4);
        hmap.put(2, 5);
        hmap.put(3, 0);
        hmap.put(4, 1);
        hmap.put(5, 2);

        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String strArray[] = str.split(" ");

        int jas = Integer.parseInt(strArray[0]);
        int jasL = jas - 1 == -1 ? 5 : jas - 1;
        int jasU = (jas + 1 == 6 ? 0 : jas + 1);

        int ja = Integer.parseInt(strArray[1]);

        int jaL = ja - 1 == -1 ? 5 : ja - 1;
        int jaU = (ja + 1 == 6 ? 0 : ja + 1);

        int d = Integer.parseInt(strArray[2]);

        ArrayList<Integer> bList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            if (i == jas || i == ja || i == d || i == jasL || i == jasU) {

            } else {
                bList.add(i);
            }
        }

        ArrayList<Integer> cList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            if (i == jas || i == ja || i == d || i == jaL || i == jaU || i == hmap.get(ja)) {

            } else {
                cList.add(i);
            }
        }

        ArrayList<Integer> aList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            if (i == jas || i == ja || i == d) {

            } else {
                aList.add(i);
            }
        }

        ArrayList<String> finalList = new ArrayList<>();

        for (int i = 0; i < aList.size(); i++) {

            int a = aList.get(i);
            int b = -1;
            int c = -1;

            for (int j = 0; j < bList.size(); j++) {

                if (a != bList.get(j)) {
                    b = bList.get(j);
                }
            }

            for (int j = 0; j < cList.size(); j++) {

                if (a != cList.get(j) && b != cList.get(j)) {
                    c = cList.get(j);
                }
            }

            if (b == -1 || c == -1) {

            } else {
                finalList.add(a + "," + b + "," + c + "," + d + "," + ja + "," + jas);

            }

        }

        if (finalList.size() > 0) {

            for (int i = 0; i < finalList.size(); i++) {
                System.out.println(finalList.get(i));
            }
        } else {
            System.out.println("No solution");
        }

    }

}
