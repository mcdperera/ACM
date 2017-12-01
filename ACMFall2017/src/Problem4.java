
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javafx.scene.shape.Line;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 502759576
 */
public class Problem4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        String filename = sc.nextLine();

        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("The file you supplied doesn't seem to exist!");
        } else {

            System.out.println("Found file " + filename);

            BufferedReader br = new BufferedReader(new FileReader(file));

            String strArray[] = br.readLine().split(" ");

            String line;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {

                try {
                    lineCount++;
                } catch (Exception e) {
                    System.out.println(line);
                    System.out.println(e.getMessage());
                }
            }

            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Failed to close buffered reader");
            }

            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            if (1 <= strArray.length && strArray.length <= 100
                    && 1 <= lineCount && lineCount <= 100) {

                BufferedReader reader = new BufferedReader(new FileReader(file));

                while ((line = reader.readLine()) != null) {

                    try {

                        ArrayList<Integer> newLine = new ArrayList<>();

                        String strar[] = line.split(" ");

                        for (String st : strar) {
                            newLine.add(Integer.parseInt(st));

                        }

                        list.add(newLine);

                    } catch (Exception e) {
                        System.out.println(line);
                        System.out.println(e.getMessage());
                    }
                }

                try {
                    reader.close();
                } catch (Exception e) {
                    System.out.println("Failed to close buffered reader");
                }

                int jj = list.size() - 1;
                for (int i = 0; i < list.size() / 2; i++) {

                    if (i % 2 == 0) {
                        ArrayList<Integer> fir = list.get(i);

                        ArrayList<Integer> last = list.get(jj);

                        Collections.reverse(last);

                        for (int lll = 0; lll < fir.size(); lll++) {

                            if (fir.get(lll) != last.get(lll)) {

                                System.out.println("This two-dimensional array is not palindromic.");
                                return;
                            }

                        }
                    } else {
                        ArrayList<Integer> fir = list.get(i);

                         int jjj = fir.size() - 1;
                        for (int lll = 0; lll < fir.size() / 2; lll++) {

                            if (i % 2 == 0) {

                                if (fir.get(lll) != fir.get(jjj)) {

                                    System.out.println("This two-dimensional array is not palindromic.");
                                    return;
                                }
                            } 

                        }

                    }

                    jj--;
                }

                System.out.println("This two-dimensional array is palindromic.");

            } else {
                System.out.println("Out of input no Constraints");
            }

//            if (0 <= no && no <= 50) {
//
//                String str = sc.nextLine();
//
//                String strArray[] = str.split(" ");
//
//                int max = 0;
//                for (String st : strArray) {
//
//                    if (max < st.length()) {
//                        max = st.length();
//                    }
//                }
//
//                for (String st : strArray) {
//
//                    int red = max - st.length();
//
//                    for (int i = 0; i < red; i++) {
//                        System.out.print(" ");
//                    }
//
//                    System.out.print(st + " ");
//
//                    char[] charArray = st.toCharArray();
//
//                    for (int i = charArray.length - 1; i >= 0; i--) {
//                        System.out.print(charArray[i]);
//                    }
//
//                    System.out.print("\n");
//                }
        }

    }
}
