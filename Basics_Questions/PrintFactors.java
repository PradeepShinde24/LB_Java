import java.util.*;

// Q5: Take input from user and print the factor of that number?

class PrintFactors
{
    public void printFactors(int num)
    {
        System.out.print("Factors of " + num + " are: ");
        for(int i=1; i<=num; i++)
        {
            if(num%i == 0)
            {
                System.out.print(i+ " ");
            }
        }
        System.out.println(" ");
    }

// Optimazation Code
    public void printFactors1(int num1)
    {
        
        System.out.print("Factors of " + num1 + " are: ");

        for (int i = 1; i <= num1/2; i++)
        {
            if (num1 % i == 0)
            {
                System.out.print(i + " "); 

                if (i != num1 / i)
                {  
                    System.out.print(num1 / i + " ");  
                }
            }
        }
        System.out.println(); 
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int Number = sc.nextInt();   

        PrintFactors obj = new PrintFactors();
        obj.printFactors(Number);

         PrintFactors obj1 = new PrintFactors();
        obj.printFactors1(Number);
    }
}