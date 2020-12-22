package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static sample.Menu.ProgramMenu;

public class NewProject {
    static Scanner input = new Scanner(System.in);
    public static void CreateProject() {
        //Eksempel på try/catch
    try {
        System.out.print("Skriv navnet på opskriften:");
        String name = input.nextLine();
        File newProject = new File("C:/Users/AstaOvergaard-Sørens/IdeaProjects/SimpleCookBookDummy/src/Saved/" + name + ".txt");
        if(newProject.createNewFile())System.out.println("Success!");
        else System.out.println ("Error, file already exists.");

        System.out.print("Tilføj ingredient:");
        List<String> ingredientsRecipe = new ArrayList<>();
        ingredientsRecipe.add(input.nextLine());
        System.out.println("Flere ingredientser?");
        System.out.println("Ja/Nej");
        String yesNo = input.nextLine();
        //Eksempel på while løkke
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
        } else if (nextNumber == 2) {
            System.out.println(name);
            System.out.println("");
            System.out.println(ingredientsRecipe);
            System.out.println("");
            System.out.println(steps);

            System.out.println("Gem opskrift?");
            System.out.println("Ja/Nej");
            yesNo = input.nextLine();
            if (yesNo.equalsIgnoreCase("Ja")) {
                FileWriter writeToFile = new FileWriter(name + ".txt");
                writeToFile.write(name);
                try{
                    FileOutputStream writeData = new FileOutputStream("peopledata.ser");
                    ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

                    writeStream.writeObject(ingredientsRecipe);
                    writeStream.flush();
                    writeStream.close();

                    writeStream.writeObject(steps);
                    writeStream.flush();
                    writeStream.close();

                }catch (IOException e) {
                    e.printStackTrace();
                }

            }
            else {
                ProgramMenu();
            }
        } else {
            System.out.println("Noget gik galt");
        }
    }
    catch(IOException ioe) {
        ioe.printStackTrace();
    }
    }




}
