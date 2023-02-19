package java;

import java.util.Scanner;

public class main {
    public void main(String[] args) {
        System.out.println("Bonjour, quel est votre prénom ?");
        Scanner scanner = new Scanner(System.in);
        String prenom = scanner.nextLine();
        System.out.println("Bonjour, " + prenom);
    }
}

