/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoofdstuk5;

/**
 *
 * @author Dunccan
 */
public class Figuur7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int teller = 1; teller <= 5; teller++) {
            for (int space = 1; space <= (5 - teller); space++){
            System.out.print(" ");
        }
            for (int kolom = 1; kolom <= teller; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
