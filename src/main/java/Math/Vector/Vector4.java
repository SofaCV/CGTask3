package Math.Vector;

public class Vector4 {
    private float x;
    private float y;
    private float z;
    private float w;

    public Vector4(float x, float y, float z, float w){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public float[][] getVector() {
        return new float[][]{{x}, {y}, {z}, {w}};
    }

    //сложение
    public static Vector4 add(Vector4 firstVector, Vector4 secondVector){
        checkArguments(firstVector);
        checkArguments(secondVector);

        float[][] res;
        res = Vector.add(firstVector.getVector(), secondVector.getVector());
        return new Vector4(res[0][0], res[1][0], res[2][0], res[3][0]);
    }

    //разность
    public static Vector4 subtract(Vector4 firstVector, Vector4 secondVector){
        checkArguments(firstVector);
        checkArguments(secondVector);

        float[][] res;
        res = Vector.subtract(firstVector.getVector(), secondVector.getVector());
        return new Vector4(res[0][0], res[1][0], res[2][0], res[3][0]);
    }

    //умножение на скаляр
    public static Vector4 multiByScalar(Vector4 vector, float scalar) {
        checkArguments(vector);

        float[][] res;
        res = Vector.multiByScalar(vector.getVector(), scalar);
        return new Vector4(res[0][0], res[1][0], res[2][0], res[3][0]);
    }

    //деление на скаляр
    public static Vector4 divByScalar(Vector4 vector, float scalar) {
        checkArguments(vector);

        if (scalar == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }

        float[][] res;
        res = Vector.divByScalar(vector.getVector(), scalar);
        return new Vector4(res[0][0], res[1][0], res[2][0], res[3][0]);
    }

    //длина
    public static float vectorLength(Vector4 vector) {
        checkArguments(vector);

        return Vector.vectorLength(vector.getVector());
    }

    //нормализация
    public static Vector4 normalization(Vector4 vector) {
        checkArguments(vector);

        float[][] res;
        res = Vector.normalization(vector.getVector());
        return new Vector4(res[0][0], res[1][0], res[2][0], res[3][0]);
    }

    //скалярное произведение
    public static float scalarMultiplication(Vector4 firstVector, Vector4 secondVector) {
        checkArguments(firstVector);
        checkArguments(secondVector);

        return Vector.scalarMultiplication(firstVector.getVector(),secondVector.getVector());
    }

    //исключения на проверку входных данных
    private static void checkArguments(Vector4 vector){
        if (vector == null) {
            throw new IllegalArgumentException("аргумент не может быть null");
        }
    }
}
