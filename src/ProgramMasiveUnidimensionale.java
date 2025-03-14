/**
 * Program Masive unidimensionale
 * - citire parametri din linia de comandă
 * - utilizare funcții din clasa String
 * - utilizare funcții de conversie din clase wrapper
 * - lucrul cu masive unidimensionale
 */

//import java.util.Scanner;

public class ProgramMasiveUnidimensionale {
    // metoda pt afisare mesaj si elem vector
    static void afisare(String mesaj, int[] vector){
        System.out.printf(mesaj + ": ");
        for(int i = 0; i < vector.length; i++)
            System.out.print(vector[i] + " ");
        System.out.println();
    }
    // metoda pt incrementare elem vector
    static void incrementare(int[] vector){
        for(int i =0; i< vector.length; i++)
            vector[i]=vector[i]+1;
    }

    public static void main(String[] args){
        // citire parametri din linia de comandă / un singur arg
        String[] valoriString = args[0].split(",");// split aloca si spatiul necesar

        // convertire valori din vectorul de strings -> vector int
        int[] valori = new int[valoriString.length];
        for (int i = 0; i < valoriString.length; i++){
            // elimina spatii goale + convertire fiecare element la int
            valori[i] = Integer.parseInt(valoriString[i].trim());
        }

        afisare("elemente", valori);
        incrementare(valori);
        afisare("dupa incrementare", valori);

    }
}
