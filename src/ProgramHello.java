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

        System.out.print("a = ");
        int a = scannerulMeu.nextInt();
        System.out.print("b = ");
        int b = scannerulMeu.nextInt();


        //System.out.println("Salut, " + numeleTau +"!" + " a + b  = " + a+b); // concat a si b
        System.out.printf("Salut, %s! a + b = %d", numeleTau, a+b);
    }
}
