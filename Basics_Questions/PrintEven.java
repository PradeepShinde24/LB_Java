import java.util.*;
import java.util.Scanner;

class PrintEven
{

// In this we taken the return type as void and Even number print from 0 to num
    public void printEven(int num)
    {
        System.out.printf("Even Numbers between the 0 to %d: ", num);
        for(int i = 0; i<= num; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    
// In this we taken the return type as Integer 
    public static int EvenNumbers(int num1)
    {
        if(num1 % 2 == 0)
        {
            return num1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        PrintEven obj = new PrintEven();
        obj.printEven(number);

        System.out.printf("Even Numbers between the 0 to %d: ",number);

// Loop for the printing Even Numbers from 0 to number
        for(int i = 0; i<= number; i++)
        {
            int result = EvenNumbers(i);
            if(result != -1)
            {
                System.out.print(result + " " );
            }
        }
        System.out.println(" ");
    }

}