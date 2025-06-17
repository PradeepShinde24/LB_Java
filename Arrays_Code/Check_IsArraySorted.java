public class Check_IsArraySorted
{
    public static boolean isSorted(int [] arr)
    {
        for(int i= 0; i<arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static void printSortedStatus(int[] arr, String name)
    {
        if (isSorted(arr))
            System.out.println(name + " is sorted");
        else
            System.out.println(name + " is not sorted");
    }

    public static void main(String [] args)
    {
        int example1[] = {4, 3, 2, 2, 5, 7, 1};
        int example2[] = {1, 3, 3, 5, 7, 10};
        int example3[] = {2, 2, 2, 2, 2};

        printSortedStatus(example1, "example1");
        printSortedStatus(example2, "example2");
        printSortedStatus(example3, "example3");
        
      
    }
}