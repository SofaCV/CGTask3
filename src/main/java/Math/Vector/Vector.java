package Math.Vector;

public class Vector {

    //сложение
    public static float[] add(float[] firstObject, float[] secondObject) {
        int row = firstObject.length;

        float[] add = new float[row];

        for(int i = 0; i < row; i++){
            add[i] = firstObject[i] + secondObject[i];
        }
        return add;
    }

    //разность
    public static float[] subtract(float[] firstObject, float[] secondObject) {
        int row = firstObject.length;
        float[] subtract = new float[row];

        for(int i = 0; i < row; i++){
            subtract[i] = firstObject[i] - secondObject[i];
        }
        return subtract;
    }

    //умножение на скаляр
    public static float[] multiByScalar(float[] object, float scalar) {
        int row = object.length;
        float[] multiByScalar = new float[row];

        for(int i = 0; i < row; i++){
            multiByScalar[i] = object[i] * scalar;
        }
        return multiByScalar;
    }

    //деление на скаляр
    public static float[] divByScalar(float[] object, float scalar) {
        int row = object.length;

        float[] divByScalar = new float[row];

        for(int i = 0; i < row; i++){
            divByScalar[i] = object[i] / scalar;
        }
        return divByScalar;
    }

    //длина
    public static float vectorLength(float[] vector) {
        int len = vector.length;
        float sum = 0;

        for (int i = 0; i < len; i++){
            sum += vector[i] * vector[i];
        }
        return (float)Math.sqrt(sum);
    }

    //нормализация
    public static float[] normalization(float[] vector) {
        int len = vector.length;
        float[] normalizationVector = new float[len];
        float vectorLength = vectorLength(vector);

        for (int i = 0; i < len; i++){
            normalizationVector[i] = vector[i] / vectorLength;

        }
        return normalizationVector;
    }

    //скалярное произведение
    public static float scalarMultiplication(float[] firstVector, float[] secondVector) {
        int len = firstVector.length;
        float scalarMultiplication = 0;

        for(int i = 0; i < len; i++){
            scalarMultiplication += firstVector[i] * secondVector[i];
        }
        return scalarMultiplication;
    }
}
