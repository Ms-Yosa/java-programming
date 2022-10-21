
import model2.ClothingSizeB;
import model2.ClothingItem2B;
import model2.HatB;
import model2.ShirtB;

import java.text.NumberFormat;

public class E21 {
    public static void main(String[] args){
        var shirt = new ShirtB(
                ClothingSizeB.M,
                19.99,
                3);
        displayItemDetails(shirt);

        var hat = new HatB(
                ClothingSizeB.M,
                19.99,
                3);
        displayItemDetails(hat);
    }

    private static void displayItemDetails(ClothingItem2B item) {
        var totalPrice = item.getPrice() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        //output using the format
        var output = String.format("Your %s order in size %s will have a total cost of %s",
                item.getType(),
                item.getSize(),
                formatter.format(totalPrice));

        System.out.println(output);
    }
}
