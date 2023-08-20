import java.util.*;

public class InsertionSort
{
    public static void insertionSort(int[] array)
    {
        int n = array.length;
        System.out.println("before sorting array: " + Arrays.toString(array));
        for (int i = 1; i < n; i++)
        {
            int key = array[i];
            int j = i - 1;
            System.out.println("key: " + key);
            System.out.println("i: " + i);
            while (j >= 0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
             System.out.println("after swapping array: " + Arrays.toString(array));
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
