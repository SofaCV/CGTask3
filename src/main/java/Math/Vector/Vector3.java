package Math.Vector;

public class Vector3 extends Vector<Vector3>{

    public Vector3(float x, float y, float z){
        super(new float[]{x, y, z});
    }

    /**
     * @param result
     * @return
     */
    @Override
    public Vector3 createNewVector(float[] result) {
        if (result.length != 3){
            throw new IllegalArgumentException("Ошибка в количестве координат. Трехмерный вектор имеет 3 координаты");
        }
        return new Vector3(result[0], result[1], result[2]);
    }
}
