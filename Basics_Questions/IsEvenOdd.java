// Q1. Write a program which checks whether number is Even or Odd.

import java.util.*;
import java.util.Scanner;

class IsEvenOdd
{
    public static boolean checkEO(int num1)
    {
        if(num1%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int iNumber = sc.nextInt();
        
        boolean bResult = false;
        bResult = checkEO(iNumber);

        if(bResult == true)
        {
            System.out.printf("%d is Even Number%n", iNumber);
        }
        else
        {
            System.out.printf("%d is Odd Number%n", iNumber);
        }
    }
}