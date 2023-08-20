import java.io.*;
import java.util.Scanner;

public class FirstProgram
{    
    public static void main(String[] args)
    {
        // System.out.println("First Program");
        // int i = 0;
        // while (i < 1 * 50)
        // {
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println(Math.max(5, 10));
        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
        var reversed = new StringBuilder().append(words).reverse();

        // var reservedWords = words.tocharArray().reserve();
        System.out.println(countWords);
        System.out.println(reversed);

    }
}