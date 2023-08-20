import java.util.Arrays;

public class BubbleSort
{
    public static void bubbleSort(int[] array)
    {

        //iterates over each element with outer and inner loop and swaps the element from right to left position
        //time complexity is O(n^2)


        System.out.println("before sorting array: " + Arrays.toString(array));
        // int n = array.length;
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    System.out.println("array[j]: " + array[j]);
                    System.out.println("array[j + 1]" + array[j + 1]);
                   
                    int temp = array[j]; 
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    System.out.println("sorting array: " + Arrays.toString(array));

                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
