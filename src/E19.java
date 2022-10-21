import model.ClothingItem;

import java.text.NumberFormat;

public class E19 {
    public static void main(String[] args){

        var item = new ClothingItem();
        item.setType("Shirt");
        item.setPrice(19.99);
        item.setSize("Small");
        item.setQuantity(2);

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
