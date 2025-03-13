import java.util.Scanner; // importa clasa Scanner

public class ProgramHello {
    public static void main(String[] args){
        System.out.println("Hello!");

        // creare obiect Scanner:

            // Scanner (clasa) numeleTau =
            // = new (operator care aloca spatiu in mem) Scanner (constructor)
            // (System.in - flux intrare date tastatura)
        Scanner scannerulMeu = new Scanner(System.in);

        System.out.print("Nume: ");

        // metoda pt cerere input tastatura
            // nextLine() - citeste o linie completa de text de la tastatura
        String numeleTau = scannerulMeu.nextLine();

        System.out.println("Salut, " + numeleTau +"!");
    }
}
