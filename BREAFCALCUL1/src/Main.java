import java.util.Scanner;

public class Main{

    static Scanner scanner = new Scanner(System.in);

    public static void MENU(){
        System.out.print("-------------MENU----------------\n" +
                "1-ADDITION \n" +
                "2-SOUSTRACTION \n" +
                "3-MULTIPLICATION \n" +
                "4-PUISSANCE \n" +
                "5-DIVISION \n" +
                "6-RACINE CARRE \n" +
                "7-FACTORIELLE \n" +
                "8-QUITTER\n" +
                "----------ENTRER VOTRE CHOIX =");
    }
    public static void addition(int a, int b) {
        System.out.println("la somme a+b =" + (a+b));
    }

    public static void soustraction(int a, int b) {
        System.out.println("la soutraction a-b =" + (a-b));
    }

    public static void multiplication(int a , int b){
        System.out.println("la multiplication a*b =" + (a*b));
    }

    public static void puissance(int base,int exposant){
        System.out.print("entrer base :");
        base=scanner.nextInt();
        System.out.print("entrer exposant :");
        exposant=scanner.nextInt();
        System.out.println(base + "  a la puissance  " + exposant + "  = " + Math.pow(base,exposant));
    }

    public static void division(double a,double b){
        if(b==0){
            System.out.println("la division par 0 est impossible");
        }else
            System.out.println("la division a/b =" +(a/b));
    }

    public static void racinecarree(int nmbr){
        System.out.printf("entrer nombre = ");
        nmbr=scanner.nextInt();
        if(nmbr<0){
            System.out.println("la racine carree d'un nombre negative est impossible ");
        }else{
            System.out.println("la racine carree de "+ nmbr +  " = "+Math.sqrt(nmbr));
        }
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
            switch (choix) {
                case 1:
                    addition(a, b);
                    break;
                case 2:
                    soustraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    puissance(a,b);
                    break;
                case 5:
                    division(a,b);
                    break;
                case 6:
                    racinecarree(a);
                    break;
                default:
                   System.out.println("CHOIX INVALIDE RESSAYER");
                    break;
            }


        } while (choix !=5);
        scanner.close();
    }
}



