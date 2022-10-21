import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class E16 {
    public static void main(String[] args){
        File file = new File("C:\\Users\\Jian\\Desktop\\linkedinlearning\\LearningJava\\Learning Java\\src\\text.txt");
        System.out.println("File exists: " + file.exists()); //true


    //read content then close the file

        try(FileReader reader = new FileReader((file));
            BufferedReader br = new BufferedReader((reader))) {
            String text = br.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
