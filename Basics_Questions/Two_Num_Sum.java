import java.util.*;

class Two_Num_Sum 
{
    public int Addition(int num1, int num2)
    {
        int Result = num1 + num2;
        return Result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int iFirst = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int iSecond = sc.nextInt();

        Two_Num_Sum obj = new Two_Num_Sum();
        int iRet = obj.Addition(iFirst, iSecond);
        System.out.println("Addition of Two Number is: "+iRet);
    }
}