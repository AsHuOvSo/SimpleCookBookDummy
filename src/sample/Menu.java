package sample;
import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static void ProgramMenu() {
        System.out.println("Vælg hvad du vil gøre nu: ");
        System.out.println("[1] Opret ny opskrift");
        System.out.println("[2] Søg efter opskrift");
        int svar = input.nextInt();
        if (svar == 1) {
            
        }
        else if (svar == 2) {

        }
        else {
            System.out.println("Something went wrong");
        }
    }
}
