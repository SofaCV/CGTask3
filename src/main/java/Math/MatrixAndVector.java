package Math;

public interface MatrixAndVector {
    //сложение
    float[][] add(float[][] firstObject, float[][] secondObject);

    //разность
    float[][] subtract(float[][] firstObject, float[][] secondObject);

    //умножение на скаляр
    float[][] multiByScalar(float[][] object, float scalar);

    //деление на скаляр
    float[][] divByScalar(float[][] object, float scalar);

}