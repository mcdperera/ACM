
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
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        for (int i = 0; i < 10000; i++) {

            double val = i * i * i;

            if (val > input) {
                System.out.println(i - 1);

                break;
            } else if (val == input) {
                System.out.println(i);

                break;
            }
        }

    }

}
