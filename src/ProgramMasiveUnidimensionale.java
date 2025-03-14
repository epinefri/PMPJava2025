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
        String[] valoriString = args[0].split(",");// split aloca si spatiul necesar

        // convertire valori din vectorul de strings -> vector int
        Integer[] valori = new Integer[valoriString.length];
        for (int i = 0; i < valoriString.length; i++){
            valori[i] = Integer.parseInt(valoriString[i].trim());
            System.out.println(valori[i]);
        }


    }
}
