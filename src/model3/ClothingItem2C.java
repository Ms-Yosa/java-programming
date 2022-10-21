package model3;

import model3.ClothingSizeC;

public class ClothingItem2C {
    // declaring constant
    public static final String SHIRT = "shirt";
    public static final String HAT = "hat";


    private String type;

    //    private String size;
    private ClothingSizeC size; //enum type
    private double price;
    private int quantity;

    //constructor

//    public ClothingItem2C(String type, String size, double price, int quantity){
//        this.type = type;
//        this.size = size;
//        this.price=price;
//        this.quantity=quantity;
//    }

    //    Enum type
    public ClothingItem2C(String type, ClothingSizeC size, double price, int quantity){
        this.type = type;
        this.size = size;
        this.price=price;
        this.quantity=quantity;
    }

    //getter : accessor method: returns value
    //setter : modifier : receives value

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public ClothingSize getSize() {
//        return size;
//    }
//
//    public void setSize(ClothingSize size) {
//        this.size = size;
//    }

    //  Enum type
    public ClothingSizeC getSize() {
        return size;
    }

    public void setSize(ClothingSizeC size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
