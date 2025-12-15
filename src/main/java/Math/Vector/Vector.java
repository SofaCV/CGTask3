package Math.Vector;
import Math.MatrixAndVector;

public class Vector extends MatrixAndVector{

    //длина
    public static float vectorLength(float[][] vector) {
        int len = vector.length;
        float sum = 0;
        for (int i = 0; i < len; i++){
            for (int j = 0; j < 1; j++){
                sum += vector[i][j] * vector[i][j];
            }
        }
        return (float)Math.sqrt(sum);
    }

    //нормализация
    public static float[][] normalization(float[][] vector) {
        int len = vector.length;
        float[][] normalizationVector = new float[len][len];
        float vectorLength = vectorLength(vector);

        for (int i = 0; i < len; i++){
            for(int j = 0; j < 1; j++){
                normalizationVector[i][j] = vector[i][j] / vectorLength;
            }
        }
        return normalizationVector;
    }

    //скалярное произведение
    public static float scalarMultiplication(float[][] firstVector, float[][] secondVector) {
        int len = firstVector.length;
        float scalarMultiplication = 0;

        for(int i = 0; i < len; i++){
            for (int j = 0; j < 1; j++){
                scalarMultiplication += firstVector[i][j] * secondVector[i][j];
            }
        }
        return scalarMultiplication;
    }
}
