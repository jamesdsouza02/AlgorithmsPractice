import java.util.*;

public class SelectionSort
{
    public static void selectionSort(int[] array)
    {
        int n = array.length;
        System.out.println("before sorting array: " + Arrays.toString(array));
        for (int i = 0; i < n - 1; i++)
        {
            int minIndex = i;
            System.out.println("before swapping: " + Arrays.toString(array));
            for (int j = i + 1; j < n; j++)
            {
                if (array[j] < array[minIndex])
                {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
            System.out.println("after swapping: " + Arrays.toString(array));
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}