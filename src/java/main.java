import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        maxmin();
    }
        public static void maxmin() {
            Scanner scanner = new Scanner(System.in);
            int a, b;

            // Maximum entre deux entiers
            System.out.println("Entrez deux entiers :");
            a = scanner.nextInt();
            b = scanner.nextInt();
            int max = (a > b) ? a : b;
            System.out.println("Le maximum est : " + max);

            // Minimum entre deux entiers
            System.out.println("Entrez deux entiers :");
            a = scanner.nextInt();
            b = scanner.nextInt();
            int min = (a < b) ? a : b;
            System.out.println("Le minimum est : " + min);

            scanner.close();
        }

}

