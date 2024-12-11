import java.util.Scanner;

public class Main{

    static Scanner scanner = new Scanner(System.in);

    public static void MENU(){
        System.out.print("-------------MENU----------------\n" +
                "1-ADDITION \n" +
                "2-SOUSTRACTION \n" +
                "3-MULTIPLICATION \n" +
                "4-DIVISION \n" +
                "5-PUISSANCE \n" +
                "6-RACINE CARRE \n" +
                "7-FACTORIELLE \n" +
                "8-QUITTER\n" +
                "----------ENTRER VOTRE CHOIX =");
    }

    public static void main(String[] args) {
        int choix, a = 0, b = 0;

        do {
            MENU();
            choix = scanner.nextInt();
            if (choix > 0 && choix < 5) {
                System.out.print("entrer a :");
                a = scanner.nextInt();
                System.out.print("entrer b :");
                b = scanner.nextInt();
            }

        } while (choix != 8);
        scanner.close();
    }
}



