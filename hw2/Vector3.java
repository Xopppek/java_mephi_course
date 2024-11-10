public class Vector3{
    private final double x, y, z;

    public Vector3(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString(){
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
    
    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    public double getZ(){
        return z;
    }

    public double getLength(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3 add(Vector3 vector){
        return new Vector3(x + vector.getX(), y + vector.getY(), z + vector.getZ());
    }

    public Vector3 sub(Vector3 vector){
        return new Vector3(x - vector.getX(), y - vector.getY(), z - vector.getZ());
    }

    public Vector3 mult(double scalar){
        return new Vector3(scalar * x, scalar * y, scalar * z);
    }

    public double dot(Vector3 vector){
        return x * vector.getX() + y * vector.getY() + z * vector.getZ();
    }

    public Vector3 cross(Vector3 vector){
        return new Vector3(y * vector.getZ() - z * vector.getY(),
                           z * vector.getX() - x * vector.getZ(), 
                           x * vector.getY() - y * vector.getX());
    }

    public double getCos(Vector3 vector){
        return this.dot(vector) / this.getLength() / vector.getLength();
    }

    public static Vector3[] getRandomArray(int n){
        Vector3[] array = new Vector3[n];
        for (int i = 0; i < n; i++){
            // Пусть пока от -10 до 10 будет
            array[i] = new Vector3(getRandomDouble(-10, 10), getRandomDouble(-10, 10), getRandomDouble(-10, 10));
        }
        return array;
    }

    private static double getRandomDouble(double maxValue, double minValue){
        double rand = Math.random();
        return rand * maxValue + (1 - rand) * minValue + rand;
    }
}