
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
public class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (0 <= str.length() && str.length() <= 20) {
            char[] charArray = str.toCharArray();

            int k = charArray.length - 1, l = 0;
            char[] let = new char[charArray.length];
            while (k >= 0) {
                let[l] = charArray[k];
                k--;
                l++;
            }

            for (int i = 0; i < let.length; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                System.out.println(let[i]);
            }
        }else       
        {
            System.out.println("Length of string is out of range");
        }
    }
}
