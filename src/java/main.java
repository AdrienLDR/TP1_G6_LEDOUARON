import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        egalitéChaine();
    }
        public static void egalitéChaine() {
            Scanner input = new Scanner(System.in);
            System.out.print("Entrez la première chaîne : ");
            String chaine1 = input.nextLine();
            System.out.print("Entrez la deuxième chaîne : ");
            String chaine2 = input.nextLine();

            boolean egalite = chaine1.equals(chaine2);
            if (egalite) {
                System.out.println("Les deux chaînes sont égales.");
            } else {
                System.out.println("Les deux chaînes ne sont pas égales.");
            }
        }

}

