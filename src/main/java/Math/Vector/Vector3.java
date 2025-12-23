package Math.Vector;

public class Vector3 {
    private float x;
    private float y;
    private float z;

    public Vector3(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getVector() {
        return new float[]{x, y, z};
    }

    //сложение
    public static Vector3 add(Vector3 firstVector, Vector3 secondVector){
        checkArguments(firstVector);
        checkArguments(secondVector);

        float[] res;
        res = Vector.add(firstVector.getVector(), secondVector.getVector());
        return new Vector3(res[0], res[1], res[2]);
    }

    //разность
    public static Vector3 subtract(Vector3 firstVector, Vector3 secondVector){
        checkArguments(firstVector);
        checkArguments(secondVector);

        float[] res = Vector.subtract(firstVector.getVector(), secondVector.getVector());
        return new Vector3(res[0], res[1], res[2]);
    }

    //умножение на скаляр
    public static Vector3 multiByScalar(Vector3 vector, float scalar) {
        checkArguments(vector);

        float[] res = Vector.multiByScalar(vector.getVector(), scalar);
        return new Vector3(res[0], res[1], res[2]);
    }

    //деление на скаляр
    public static Vector3 divByScalar(Vector3 vector, float scalar) {
        checkArguments(vector);

        if (scalar == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }

        float[] res = Vector.divByScalar(vector.getVector(), scalar);
        return new Vector3(res[0], res[1], res[2]);
    }

    //длина
    public static float vectorLength(Vector3 vector) {
        checkArguments(vector);

        return Vector.vectorLength(vector.getVector());
    }

    //нормализация
    public static Vector3 normalization(Vector3 vector) {
        checkArguments(vector);

        float[] res = Vector.normalization(vector.getVector());
        return new Vector3(res[0], res[1], res[2]);
    }

    //скалярное произведение
    public static float scalarMultiplication(Vector3 firstVector, Vector3 secondVector) {
        checkArguments(firstVector);
        checkArguments(secondVector);

        return Vector.scalarMultiplication(firstVector.getVector(),secondVector.getVector());
    }

    //исключения на проверку входных данных
    private static void checkArguments(Vector3 vector){
        if (vector == null) {
            throw new IllegalArgumentException("аргумент не может быть null");
        }
    }

    //векторное произведение
//    public Vector3 vectorMultiplication(){
//
//
//        return vectorMultiplication;
//    }
}
