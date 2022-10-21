public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    /*

    >>> Classes start with an uppercase character
    public class MyClass

    >>> Methods & variables start with a lowercase character
    void doSomething(String withThis)

    >>> Constants in java always in uppercase and uses public static final
     public static final String FIRSTNAME = "David";

     -------------------

     >>> Primitive Data Type
     . All lowercase ( int, char, short, long, double, float, boolean, byte)
     . declaration:  datatype identifier assignment value;
                      int myVar = 5;
     . alpha notation: use inferred data typing : var identifier assignment value+(f = float, d = double, L = Long)
                        var myFloat = 5f

     >>>Wrapper Class
     . Starts with an Uppercase (Integer, Character, Short ...)


     >>> Object Variables
     . declaration. w/ null value : ClothingItem item;
                    initializing value: ClothingItem item = new ClothingItem();
                    inferred typing: var item = new ClothingItem();

      >>> Conversion
      . widening: expand memory ( short => int)
                    short sh = 100;
                    int i = sh;
                    long longValue = i;
       . lossy conversion : might lose some data during conversion (long => short)
                            short shortValue = longValue;
                         : must use special syntax  // can still lose data
                           short shortValue = (short) longValue;

         >>> Unicode
         >>>> Operators
         .Equality
         .assignment
         .mathematical
         . Logical ( &&, ||, )
         .Ternary (?=) : if-then
                        var message = (i ==1) // boolean test
                        ? "There is 1"  // if true
                        : " There are " + i; // if false
                        System.out.println(message)

         >>> Inheritance
         . relationship b/w classes
                . superclass/subclass (used by java)
                    * keyword extends - creates inheritance relationship
                    *superclass
                            *public class ClothingItem{
                                private String size;
                                public String getType(){
                                    return "Clothing Item";
                                }
                                public String getSize(){
                                    return size;
                                }
                                public void setSize(String size){
                                    this.size = size;
                                }
                            }

                    . subclasses extend superclasses
                            * public class Hat extends ClothingItem{
                                public String getType(){
                                return "Hat";
                                }
                            }
                . parent/child
                . base/derived
                . superclass/subclass
         . java only supports single inheritance
         . each class can extend only one direct superclass
         . Polymorphism
                . address an object as either super- or subtype
                * ClothingItem item = new Hat();
                   System.out.println("This is a " + item.getType());



     */


}