package sample;

import java.util.Scanner;

import static sample.Menu.ProgramMenu;

public class Velkommen {

    static Scanner input = new Scanner(System.in);

    public static void VelkommenStart() {
        System.out.println("Velkommen til den Simple Kogebog applikation.");
        System.out.println("Test venligst at programmet kan modtage input ved at skrive 'Kogebog'");
        CheckOmProgrammetVirker();
    }

    public static void CheckOmProgrammetVirker() {
        String keyword = input.nextLine();
        System.out.println(keyword);
        if (keyword.equalsIgnoreCase("Kogebog")) {
            System.out.println("Programmet virker");
            ProgramMenu();
        }
        else if (!keyword.equalsIgnoreCase("kogebog")) {
            System.out.println("Programmet virker ikke");
            System.out.println("Genstart venligst programmet");
        }
    }




}


