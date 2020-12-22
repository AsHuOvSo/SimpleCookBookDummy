package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static sample.Menu.ProgramMenu;

public class NewProject {
    static Scanner input = new Scanner(System.in);

    public static void CreateProject() {
        System.out.print("Skriv navnet på opskriften:");
        String name = input.nextLine();
        /*File newProject = new File(name + ".txt");*/
        System.out.print("Tilføj ingredient:");
        List<String> ingredientsRecipe = new ArrayList<>();
        ingredientsRecipe.add(input.nextLine());
        System.out.println("Flere ingredientser?");
        System.out.println("Ja/Nej");
        String yesNo = input.nextLine();
        while (yesNo.equalsIgnoreCase("Ja")) {
            System.out.print("Tilføj ingredient:");
            ingredientsRecipe.add(input.nextLine());
            System.out.println("Flere ingredientser?");
            System.out.println("Ja/Nej");
            yesNo = input.nextLine();
        }
        System.out.print("Tilføj første skridt: ");
        List<String> steps = new ArrayList<>();
        steps.add(input.nextLine());
        System.out.println("Flere instruktioner?");
        System.out.println("Ja/Nej");
        yesNo = input.nextLine();
        while (yesNo.equalsIgnoreCase("Ja")) {
            System.out.print("Tilføj næste skridt: ");
            steps.add(input.nextLine());
            System.out.println("Flere instruktioner?");
            System.out.println("Ja/Nej");
            yesNo = input.nextLine();
        }
        System.out.println("Returner til hovedmenuen eller se opskrift?");
        System.out.println("[1] Hovedmenu");
        System.out.println("[2] Se Opskrift");
        int nextNumber = input.nextInt();
        if (nextNumber == 1) {
            ProgramMenu();
        }
        else if (nextNumber == 2) {
            System.out.println(name);
            System.out.println("");
            System.out.println(ingredientsRecipe);
            System.out.println("");
            System.out.println(steps);
        }
        else {
            System.out.println("Noget gik galt");
        }
    }




}
