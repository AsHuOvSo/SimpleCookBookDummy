package sample;
import java.util.Scanner;

import static sample.NewProject.CreateProject;

public class Menu {
    static Scanner input = new Scanner(System.in);
    public static void ProgramMenu() {
        System.out.println("Vælg hvad du vil gøre nu: ");
        System.out.println("[1] Opret ny opskrift");
        System.out.println("[2] Søg efter opskrift");
        int svar = input.nextInt();
        if (svar == 1) {
            CreateProject();
        }
        else if (svar == 2) {
            System.out.println("Denne funktion er ikke implementeret endnu");
        }
        else {
            System.out.println("Something went wrong");
        }
    }
}
