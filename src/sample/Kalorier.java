package sample;

public class Kalorier extends Ingredients{
    public Kalorier(String name, double amount, String type, int kalorierPrGram) {
        super(name, amount, type);
    }
    public static double UdregnKalorierForIngredient(int gram, int kalorierPrGram) {
        int kalorierIngredient = gram * kalorierPrGram;
        return kalorierIngredient;
    }

}
