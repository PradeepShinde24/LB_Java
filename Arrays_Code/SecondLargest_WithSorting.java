import java.util.Arrays;

public class SecondLargest_WithSorting
{
    public static void main(String[] args)
    {
        int[] arr = {-7, 2, 9, 1, 7, 6};

        if (arr.length < 2)
        {
            System.out.println("Array must have at least two elements.");
            return;
        }

        Arrays.sort(arr);  // Sort in ascending order

        int largest = arr[arr.length - 1]; // Last element after sorting

        // Traverse backwards to find second largest
        for (int i = arr.length - 2; i >= 0; i--)
        {
            if (arr[i] != largest)
            {
                System.out.println("Second Largest Number: " + arr[i]);
                return;
            }
        }

        System.out.println("No second largest number found (all elements may be equal).");
    }
}