/**
 * Program Masive unidimensionale
 *
 * - citire parametri din linia de comandă
 * - utilizare funcții din clasa String
 * - utilizare funcții de conversie din clase wrapper
 * - lucrul cu masive unidimensionale
 */

public class ProgramMasiveUnidimensionale {
    public static void main(String[] args){
        // declararea unui vector
        int[] vector = new int[4];
        // atribuire valori
        vector[0] = 10;
        vector[1] = 11;
        vector[2] = 12;

        //afisare elemente vector
        for(int i = 0; i < 3; i++ ){
            System.out.print(vector[i] + " ");
        }
    }
}
