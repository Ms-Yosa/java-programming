import model.ClothingItem2;

import java.text.NumberFormat;

public class E20 {
    public static void main(String[] args){
        var item = new ClothingItem2(ClothingItem2.SHIRT, "Small", 19.99, 3);

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
