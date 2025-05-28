import java.util.*;

public class IsPerfectNumber
{
    public boolean checkPerfect(int num)
    {
        int iSum = 0;

        for(int i=1; i<=num/2; i++)
        {
            if(num%i == 0)
            {
                iSum = iSum+i;
            }
            if(iSum > num)
            {
                break;
            }
        }

        if(iSum == num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        
        boolean bResult = false;

        IsPerfectNumber obj = new IsPerfectNumber();
        bResult = obj.checkPerfect(number);

        if(bResult == true)
        {
            System.out.printf("%d is Perfect Number", number);
        }
        else
        {
            System.out.printf("%d is not Perfect Number:", number);
        }
        System.out.println(" ");


    }
     
}