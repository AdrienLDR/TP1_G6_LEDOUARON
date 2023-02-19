import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        parite();
    }
        public static void parite() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez saisir un entier :");
            int nombre = scanner.nextInt();

            if (nombre % 2 == 0) {
                System.out.println(nombre + " est pair.");
            } else {
                System.out.println(nombre + " est impair.");
            }
        }

}

