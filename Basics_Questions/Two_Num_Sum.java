import java.util.*;

class Two_Num_Sum 
{
    public double Addition(double num1, double num2)
    {
        double Result = num1 + num2;
        return Result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        double iFirst = sc.nextDouble();

        System.out.print("Enter the Second Number: ");
        double iSecond = sc.nextDouble();

        Two_Num_Sum obj = new Two_Num_Sum();
        double iRet = obj.Addition(iFirst, iSecond);
        System.out.println("Addition of Two Number is: "+iRet);
    }
}