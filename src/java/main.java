import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        discriminant();
    }
    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        } else if (delta == 0) {
            double x0 = (double) -b / (2 * a);
            System.out.println("Le polynome a une racine double : x0 = " + x0);
        } else {
            double x0 = (-b + Math.sqrt(delta)) / (2 * a);
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Le polynome a deux racines distinctes : x0 = " + x0 + " et x1 = " + x1);
        }
    }



}

