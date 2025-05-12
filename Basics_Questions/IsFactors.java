import java.util.*;

// Q4: Take two inputs from user and check the second input is factor of first input 

class IsFactros
{
    public static boolean isfactorNumber(int number, int num)
    {
        if(number % num == 0)
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
        int Number = sc.nextInt();
        
        System.out.print("Enter the Factor Number: ");
        int num1 = sc.nextInt();

        boolean bResult = false;
        bResult = isfactorNumber(Number, num1);

        if(bResult==true)
        {
            System.out.printf("%d is factor of %d ", num1, Number);
        }
        else
        {
            System.out.printf("%d is not factor of %d", num1, Number);
        }
        System.out.println(" ");

    }
}