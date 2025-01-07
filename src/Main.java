import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      //Esercizio 1

      //  multiply();

      //  inserisciArray();

      /*  String word = scanner.nextLine();
        int num = scanner.nextInt();
        concatena(word, num); */

        //Esercizio 2
        /*
        System.out.println("Esercizio 2");
        System.out.println("Inserici prima stringa");
        String primaStringa = scanner.nextLine();
        System.out.println("Inserisci seconda stringa");
        String secondaStringa = scanner.nextLine();
        System.out.println("Inserisci terza stringa");
        String terzaStringa = scanner.nextLine();

        String tuttoInsieme = primaStringa + " " + secondaStringa + " " + terzaStringa;
        System.out.println(tuttoInsieme);
        */
        
        //Esercizio 3
    }
    static int multiply(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserici primo numero");
        int x = scanner.nextInt();
        System.out.println("Inserici secondo numero");
        int y = scanner.nextInt();

        int prodotto = x * y;
        System.out.println("Il prodotto dei due numeri è: " + prodotto);
        return prodotto;
    }

    static void concatena(String example, int e){
        String concat = example + e;
        System.out.println(concat);
    }

    static void inserisciArray (){
        //array con 5 elementi
        String[] fiveGreetings = {"Hello","Ciao", "Hola", "Hej", "Ahoj"};
        //stampiamo l'array
        System.out.println(Arrays.toString(fiveGreetings));

        //Nuovo array con spazio per sei elementi
        String[] sixGreetings = new String[fiveGreetings.length + 1];

        System.arraycopy(fiveGreetings, 0, sixGreetings, 0, fiveGreetings.length);

        sixGreetings[2]= "Salut";
        System.out.println(Arrays.toString(sixGreetings));
    }

}