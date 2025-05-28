import java.util.*;

public class IsPrime
{
    public static boolean isPrimenumber(int Num)
    {
        if(Num<= 1)
        {
            return false;
        }

        for(int i=2; i<=(Num/2); i++)
        {
            if((Num%i ) == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {

        boolean bResult = isPrimenumber(21);

        if(bResult == true)
        {
            System.out.println("Number is Prime number");
        }
        else
        {
            System.out.println("Number is Not Prime number");
        }

    }
}