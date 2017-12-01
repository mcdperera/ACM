
import java.io.FileNotFoundException;
import java.io.IOException;
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
public class Problem6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        int firstLine = sc.nextInt();
        int no = 0;
        if (0 <= firstLine && firstLine <= 701408733) {

            boolean isFound = false;
            for (int i = 1; i <= 45; i++) {

                if (firstLine == fibonacci(i)) {
                    //System.out.println("fibonacci no " + i);
                    isFound = true;
                    no = i;
                    break;
                }
            }

            if (!isFound) {
                System.out.println(firstLine
                        + " is not in the first 45 elements of the fibonacci sequence");

                return;
            } else {
              
                
                 System.out.println(recaman(no));
            }

        } else {

        }
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int recaman(int n) {
        final int[] seq = new int[500001];
        // Array to check if the number is in the sequence.
        final boolean[] check = new boolean[9 * seq.length];
        // Give an initial value for the calculations.
        seq[0] = 0;
        // Precompute all values.
        for (int i = 1; i <= 500000; i++) {
            seq[i] = seq[i - 1] - i;
            // If result is positive and is not in the sequence.
            if ((seq[i] > 0) && !check[seq[i]]) {
                check[seq[i]] = true;
            } else {
                seq[i] = seq[i - 1] + i;
                // Add to sequence.
                check[seq[i]] = true;
            }
        }

        return seq[n];

    }

}
