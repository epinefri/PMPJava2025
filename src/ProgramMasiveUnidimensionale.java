/**
 * Program Masive unidimensionale
 *
 * - citire parametri din linia de comandă
 * - utilizare funcții din clasa String
 * - utilizare funcții de conversie din clase wrapper
 * - lucrul cu masive unidimensionale
 */

//import java.util.Scanner;

public class ProgramMasiveUnidimensionale {
    public static void main(String[] args){
        // citire parametri din linia de comandă / un singur arg
        String[] valoriString = args[0].split(",");
        for(int i = 0; i<valoriString.length; i++){
            System.out.printf("Elementul %d: ", i);
            System.out.print(valoriString[i] + " ");
        }


    }
}
