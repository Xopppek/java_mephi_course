import java.util.Arrays;
import java.util.Scanner;

public class MyArrays{
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0){
            sc.close();
            throw new IllegalArgumentException("Array size must be more than zero");
        }
        
        var arr = new double[n];
        fillArrayRandom(arr, -1, 1);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    public static void fillArrayRandom(double[] arr){
        // Math.random() по умолчанию работает с значениями с плавающей точкой,
        // возвращая значения в промежутке [0, 1), поэтому я решил, что наиболее 
        // интуитивно будет по умолчанию такое и возвращать
        fillArrayRandom(arr, 0, 1);
    }

    public static void fillArrayRandom(double[] arr, double minValue, double maxValue){
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.random() * (maxValue - minValue) + minValue;
        }
    }

    public static void fillArrayRandom(int[] arr){
        // наиболее интуитивно для пользователя на мой взгляд, возвращать
        // по умолчанию произвольное число из всего диапазона интов
        fillArrayRandom(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void fillArrayRandom(int[] arr, int minValue, int maxValue){
        for (int i = 0; i < arr.length; i++){
            // тут maxValue - minValue + 1, потому что ожидается, что случаеное число
            // может принять значение maxValue
            arr[i] = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
        }
    }
}