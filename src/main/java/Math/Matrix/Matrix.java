package Math.Matrix;

public class Matrix{
    //сложение
    public static float[][] add(float[][] firstObject, float[][] secondObject) {
        int row = firstObject.length;
        int col = firstObject[0].length;
        float[][] add = new float[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                add[i][j] = firstObject[i][j] + secondObject[i][j];
            }
        }
        return add;
    }

    //разность
    public static float[][] subtract(float[][] firstObject, float[][] secondObject) {
        int row = firstObject.length;
        int col = firstObject[0].length;
        float[][] subtract = new float[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                subtract[i][j] = firstObject[i][j] - secondObject[i][j];
            }
        }
        return subtract;
    }

    //умножение на скаляр
    public static float[][] multiByScalar(float[][] object, float scalar) {
        int row = object.length;
        int col = object[0].length;
        float[][] multiByScalar = new float[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                multiByScalar[i][j] = object[i][j] * scalar;
            }
        }
        return multiByScalar;
    }

    //деление на скаляр
    public static float[][] divByScalar(float[][] object, float scalar) {
        int row = object.length;
        int col = object[0].length;
        float[][] divByScalar = new float[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                divByScalar[i][j] = object[i][j] / scalar;
            }
        }
        return divByScalar;
    }
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
