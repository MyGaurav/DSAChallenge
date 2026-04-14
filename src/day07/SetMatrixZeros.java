package src.day07;
import java.util.HashSet;
public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 0}
        };
        setZeroes(matrix);
        System.out.println(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>(),cols = new HashSet<>() ;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rows.contains(i) || cols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

