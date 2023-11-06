package Lecture1;

import java.util.Random;

public class Find {
    public static void main(String[] args) {
        // var arr = createArray(50);
        // printArray(arr);
        // System.out.println(find(arr, 0));
        var array = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        System.out.println(binarySearch(array, 3));
    }

    /**
     * Классический поиск перебором
     * Сложность O(n)
     */
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    /**
     * Бинарный поиск
     * **Только для отсортированных массивов!
     * Сложность O(log n)
     */
    public static int binarySearch(int[] array, int value, int min, int max) {
        int midPoint;
        if (max < min) {
            return -1;
        } else {
            midPoint = (max - min) / 2 + min;
        }
        if (array[midPoint] < value) {
            return binarySearch(array, value, midPoint + 1, max);
        } else {
            if (array[midPoint] > value) {
                return binarySearch(array, value, min, midPoint - 1);
            } else {
                return midPoint;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static int[] createArray(int size) {
        var rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        return array;
    }
}