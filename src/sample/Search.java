package sample;

import java.io.File;

public class Search {

    public static void searchForRecipe() {
    File dir = new File("C:/Users/AstaOvergaard-Sørens/IdeaProjects/SimpleCookBookDummy/src/Saved");
    String[] children = dir.list();

      if (children == null) {
        System.out.println("does not exist or is not a directory");
    } else {
        for (int i = 0; i < children.length; i++) {
            String filename = children[i];
            System.out.println(filename);
        }
    }
    }

}

