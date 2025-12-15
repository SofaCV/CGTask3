package Math.Vector;

public class Vector2 {
    private float x;
    private float y;

    public Vector2(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[][] getVector() {
        return new float[][]{{x}, {y}};
    }

    //сложение
    public static Vector2 add(Vector2 firstVector, Vector2 secondVector){
        checkArguments(firstVector);
        checkArguments(secondVector);

        float[][] res;
        res = Vector.add(firstVector.getVector(), secondVector.getVector());
        return new Vector2(res[0][0], res[1][0]);
    }

    //разность
    public static Vector2 subtract(Vector2 firstVector, Vector2 secondVector){
        checkArguments(firstVector);
        checkArguments(secondVector);

        float[][] res;
        res = Vector.subtract(firstVector.getVector(), secondVector.getVector());
        return new Vector2(res[0][0], res[1][0]);
    }

    //умножение на скаляр
    public static Vector2 multiByScalar(Vector2 vector, float scalar) {
        checkArguments(vector);

        float[][] res;
        res = Vector.multiByScalar(vector.getVector(), scalar);
        return new Vector2(res[0][0], res[1][0]);
    }

    //деление на скаляр
    public static Vector2 divByScalar(Vector2 vector, float scalar) {
        checkArguments(vector);

        if (scalar == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }

        float[][] res;
        res = Vector.divByScalar(vector.getVector(), scalar);
        return new Vector2(res[0][0], res[1][0]);
    }

    //длина
    public static float vectorLength(Vector2 vector) {
        checkArguments(vector);

        return Vector.vectorLength(vector.getVector());
    }

    //нормализация
    public static Vector2 normalization(Vector2 vector) {
        checkArguments(vector);

        float[][] res;
        res = Vector.normalization(vector.getVector());
        return new Vector2(res[0][0], res[1][0]);
    }

    //скалярное произведение
    public static float scalarMultiplication(Vector2 firstVector, Vector2 secondVector) {
        checkArguments(firstVector);
        checkArguments(secondVector);

        return Vector.scalarMultiplication(firstVector.getVector(), secondVector.getVector());
    }

    //исключения на проверку входных данных
    private static void checkArguments(Vector2 vector){
        if (vector == null) {
            throw new IllegalArgumentException("аргумент не может быть null");
        }
    }
}
