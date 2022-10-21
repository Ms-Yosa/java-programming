package model;

public class ClothingItem2 {

    // declaring constant
    public static final String SHIRT = "shirt";


    private String type;

//    private String size;
    private ClothingSize size; //enum type
    private double price;
    private int quantity;

    //constructor

//    public ClothingItem2(String type, String size, double price, int quantity){
//        this.type = type;
//        this.size = size;
//        this.price=price;
//        this.quantity=quantity;
//    }

//    Enum type
   public ClothingItem2(String type, ClothingSize size, double price, int quantity){
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
    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
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
