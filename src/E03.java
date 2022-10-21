public class E03 {

    // string interpolation = evaluating string literal containing one or more placeholders

    public static void main(String[] args){
        var item = "shirt";
        var size = "M";
        var prize = 14.99;
        var color = "Red";

        String template = "Clothing item: %s, size %s, prize %.2f in color %s";
        String newString = String.format(template, item, size, prize, color);
        System.out.println(
                newString
        );


    }
}
