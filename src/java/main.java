
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        division();
    }


    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier : ");
        int a = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier : ");
        int b = scanner.nextInt();
        if (b == 0) {
            System.out.println("Division par zéro impossible !");
        } else {
            float resultat = (float) a / (float) b;
            System.out.println("Le résultat de " + a + " / " + b + " est : " + resultat);
        }
    }
}

