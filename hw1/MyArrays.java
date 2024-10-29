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
        
        var arr = new int[n];
        fillArrayRandom(arr, -1, 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(getMaxValue(arr));
        System.out.println(getMinValue(arr));
        System.out.println(getAvgValue(arr));

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

    public static int getMaxValue(int[] arr){
        checkArrayInput(arr);
        int maxValue = arr[0];
        for (int x : arr){
            if (x > maxValue)
                maxValue = x;
        }

        return maxValue;
    }

    public static int getMinValue(int[] arr){
        checkArrayInput(arr);
        int minValue = arr[0];
        for (int x : arr){
            if (x < minValue)
                minValue = x;
        }

        return minValue;
    }

    public static double getAvgValue(int[] arr){
        checkArrayInput(arr);
        int n = arr.length;
        double avg = 0;
        for (double x : arr){
            // вычисляю сумму сразу деля на n, чтобы избежать возможного переполнения
            avg += x / n;
        }

        return avg;
    }

    public static double getMaxValue(double[] arr){
        checkArrayInput(arr);
        double maxValue = arr[0];
        for (double x : arr){
            if (x > maxValue)
                maxValue = x;
        }

        return maxValue;
    }

    public static double getMinValue(double[] arr){
        checkArrayInput(arr);
        double minValue = arr[0];
        for (double x : arr){
            if (x < minValue)
                minValue = x;
        }

        return minValue;
    }

    public static double getAvgValue(double[] arr){
        checkArrayInput(arr);
        int n = arr.length;
        double avg = 0;
        for (double x : arr){
            avg += x / n;
        }

        return avg;
    }

    private static void checkArrayInput(int[] arr){
        if (arr == null)
            throw new NullPointerException();
        if (arr.length == 0)
            throw new IllegalArgumentException("Array length must be more than zero");
    }

    private static void checkArrayInput(double[] arr){
        if (arr == null)
            throw new NullPointerException();
        if (arr.length == 0)
            throw new IllegalArgumentException("Array length must be more than zero");
    }
}