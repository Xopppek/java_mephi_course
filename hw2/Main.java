public class Main {
    public static void main(String[] args) {
        var vector1 = new Vector3(1, 3, 2);
        var vector2 = new Vector3(-3, 2, 4);
        System.out.println("Vector1: " + vector1);
        System.out.println("Vector2: " + vector2);
        System.out.println("Сумма: " + vector1.add(vector2));
        System.out.println("Разность: " + vector1.sub(vector2));
        System.out.println("Умножение vector1 на -3: " + vector1.mult(-3));
        System.out.println("Скалярное произведение: " + vector1.dot(vector2));
        System.out.println("Векторное произведение: " + vector1.cross(vector2));
        System.out.println("Косинус между векторами: " + vector1.getCos(vector2));

        Vector3[] vectors = Vector3.getRandomArray(4);
        System.out.println("Случайно сгенерированные вектора:");
        for (var vector : vectors)
            System.out.println(vector);
    }
}
