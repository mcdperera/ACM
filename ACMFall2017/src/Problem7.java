
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
public class Problem7 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        int firstLine = sc.nextInt();

        if (1 <= firstLine && firstLine <= 300) {

            int n = 0;
            for (int i = 1; i <= 300; i++) {

                if (firstLine == fibonacci(i)) {
                    n = i;
                }

            }

            System.out.println("Value for " + firstLine + "is " + n);
            
        } else {
            System.out.println(firstLine
                    + "out of range");
        }
    }

    public static int fibonacci(int n) {

        int i;
        for (i = 0; i < 100; i++) {

            if (n == 1) {
                break;
            }

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

        }

        return i+1;

    }

}
