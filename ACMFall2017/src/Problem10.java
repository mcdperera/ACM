
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
public class Problem10 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        String filename = sc.nextLine();

        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("The file you supplied doesn't seem to exist!");
        } else {

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            ArrayList<ArrayList<String>> list = new ArrayList<>();

            while ((line = reader.readLine()) != null) {

                try {

                    ArrayList<String> newLine = new ArrayList<>();

                    String strar[] = line.split("");

                    for (String st : strar) {
                        newLine.add(st);

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

            ArrayList<String> stringBuilder = new ArrayList<>();

            boolean startRead = false;

            int writeInt = 0;
            /*stringBuilder*/
            for (int i = 0; i < list.size(); i++) {

                ArrayList<String> newLine = list.get(i);

                boolean isLeftRead = false;
                
                for (int j = 0; j < newLine.size(); j++) {
                               
                    String st = newLine.get(j);

                    if ("R".equals(st)) {
                    } else if (startRead && "\"".equals(st)) {
                        startRead = false;
                    } else if ("\"".equals(st)) {
                        startRead = true;
                    } else if (startRead) {
                        writeInt++;
                        stringBuilder.add(st);
                    } else if ("_".equals(st)) {
                    } else if ("L".equals(st)) {
                        isLeftRead = true;

                    } else if ("U".equals(st)) {
                        break;
                    } else if ("D".equals(st)) {
                        i--;
                        break;
                    } else if (isNumeric(st)) {
                        stringBuilder.add(st);
                    } else if ("Q".equals(st)) {
                        return;
                    } else if ("P".equals(st)) {
                        writeInt--;
                        System.out.print(stringBuilder.get(writeInt));

                    }
                }

            }
        }

    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
