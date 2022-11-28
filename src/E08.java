import java.util.Arrays;

public class E08 {
    public static void main(String[] args){
//        int[][][] numbers = new int[2][3][5]; // [rows][columns][length]
//        numbers[0][0][0]=1;

        int[][] numbers = new int[2][3];
        numbers[0][0] =1;
        System.out.println(Arrays.deepToString(numbers));

        int [][]matrix = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(matrix));

    }
}
