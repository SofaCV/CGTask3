package Math.Matrix;
import Math.MatrixAndVector;

public class Matrix extends MatrixAndVector{

    //транспонирование
    public static float[][] transposition(float[][] matrix) {
        int len = matrix.length;
        float buffer;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                buffer = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buffer;
            }
        }
        return matrix;
    }
}
