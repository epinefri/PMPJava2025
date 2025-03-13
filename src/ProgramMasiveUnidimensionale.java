/**
 * Program Masive unidimensionale
 *
 * - citire parametri din linia de comandă
 * - utilizare funcții din clasa String
 * - utilizare funcții de conversie din clase wrapper
 * - lucrul cu masive unidimensionale
 */

import java.util.Scanner;

public class ProgramMasiveUnidimensionale {
    public static void main(String[] args){
        // declararea unui vector
        int[] vector = new int[4];

        // citire parametri din linia de comandă
        Scanner scannerulMeu = new Scanner(System.in);
        for(int i = 0; i<4; i++){
             System.out.printf("Elementul %d: ", i);
             vector[i] = scannerulMeu.nextInt();
        }

        //afisare elemente vector
        for(int i = 0; i < 4; i++ ){
            System.out.print(vector[i] + " ");
        }
    }
}
