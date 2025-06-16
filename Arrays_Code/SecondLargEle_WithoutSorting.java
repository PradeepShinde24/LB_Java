public class SecondLargEle_WithoutSorting
{
     public static void main(String[] args)
     {
        int[] arr = {5, 2, 9, 1, 7, 6};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE)
        {
            System.out.println("No second largest number found.");
        }
        else
        {
            System.out.println("Second Largest Number: " + secondLargest);
        }
     }
}

