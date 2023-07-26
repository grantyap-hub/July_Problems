import java.util.Arrays;

public class _48_Rotate_Image_ {

    public static void rotate(int[][] matrix){
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            int a = 0;
            int b = n-1;
            while(a<b) {
                int temp = matrix[a][i];
                matrix[a][i] = matrix[b][i];
                matrix[b][i] = temp;
                a++;
                b--;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int[] ints : matrix){
            System.out.println(Arrays.toString(ints));
        }



    }
}
