import model3.ClothingItem2C;

import model3.ClothingSizeC;
import model3.HatC;
import model3.ShirtC;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E22 {
    public static void main(String[] args) {

//  Storing values in unresizable arrays (ordered collection)

//        //array declaration
//        String[] colors = new String[3];
//        colors[0] = "Red";
//        colors[1] = "Green";
//        colors[2] = "Blue";
//
//        //display array
//        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i]);
//        }
//
// -------------------------------
//        ClothingItem2C[] items = {
//                new ShirtC(
//                        ClothingSizeC.M,
//                        19.99,
//                        3
//                    ),
//                new HatC(
//                        ClothingSizeC.M,
//                        19.99,
//                        3
//                    ),
//        };
//display array using foreach
// syntax: for(variable:data)
//        for (ClothingItem2C item : items) {
//            displayItemDetails(item);
//        }
// ------------------------------------------

// declaring and displaying array values using list handling (ordered collection)

//        List<String> colors = new ArrayList<>();
//        colors.add("Green");
//        colors.add("Red");
//        colors.add("Blue");
//        for (int i = 0; i < colors.size(); i++) {
//            System.out.println(colors.get(i));
//        }
//
//        List<ClothingItem2C> items = new ArrayList<>();
//        items.add(
//                new ShirtC(
//                        ClothingSizeC.M,
//                        19.99,
//                        3
//                )
//        );
//        items.add(
//                new HatC(
//                        ClothingSizeC.M,
//                        19.99,
//                        3
//                )
//        );
//
//        for (ClothingItem2C item: items) {
//            displayItemDetails(item);
//        }
//    }

// ------------------------------------------
// declaring and displaying  values using Map handling (ordered collection)

        Map<String, ClothingItem2C> items = new HashMap<>();
        items.put(
                "shirt",
                new ShirtC(
                        ClothingSizeC.M,
                        19.99,
                        3)
        );
        items.put(
                "hat",
                new HatC(
                        ClothingSizeC.M,
                        19.99,
                        3)
        );

// retreive 1 item from the map
//        var anItem = items.get("hat");
//        displayItemDetails(anItem);

// retreive all items from the map
        var keys = items.keySet();
        for ( String key: keys) {
            var item = items.get(key);
            displayItemDetails(item);
            
        }
    }

// ------------------------------------------
    private static void displayItemDetails(ClothingItem2C item) {
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
