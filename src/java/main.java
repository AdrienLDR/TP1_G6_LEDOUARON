import java.util.Scanner;

public class main {

    public static void volume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la longueur du pavé droit :");
        float longueur = scanner.nextFloat();

        System.out.println("Entrez la largeur du pavé droit :");
        float largeur = scanner.nextFloat();

        System.out.println("Entrez la hauteur du pavé droit :");
        float hauteur = scanner.nextFloat();

        float volume = longueur * largeur * hauteur;

        System.out.println("Le volume du pavé droit est de " + volume + " m³");
    }

    public static void main(String[] args) {
        volume();
    }
}

