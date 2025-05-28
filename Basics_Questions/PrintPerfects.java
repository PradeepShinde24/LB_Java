import java.util.*;

public class PrintPerfects
{
    public static void printPerfectNumbers(int Num)
    {
        System.out.printf("Perfect Numbers Between the 1 to %d: ", Num);
        for(int i = 1; i<= Num; i++)
        {
            int iSum = 0;

            for(int j=1; j<=i/2; j++)
            {
                if(i%j == 0)
                {
                    iSum = iSum + j;
                }
            }
        
            if(iSum == i)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int Number = sc.nextInt();

        printPerfectNumbers(Number);

        // System.out.println();
    }
}