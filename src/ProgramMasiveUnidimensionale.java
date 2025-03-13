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
        // declararea unui vector
        String[] vector = new String[args.length];

        // citire parametri din linia de comandă
        for(int i = 0; i<args.length; i++){
             System.out.printf("Elementul %d: ", i);
             vector[i] = args[i];
            System.out.print(vector[i] + " ");
        }


    }
}
