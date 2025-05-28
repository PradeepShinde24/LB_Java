// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class PrintOdd
{
    public static void printOdd(int num1, int num2)
    {
        int iSum = 0;
        System.out.print("Odd Numbers: ");
        
        for(int i = num1; i<=num2; i++)
        {
            if(i%2 != 0)
            {
                iSum = iSum + i;
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        System.out.println("Odd Numbers Sum: "+iSum);
    }
    
    public static void main(String[] args)
    {
        System.out.println("Try programiz.pro");
        printOdd(50, 60);
      
    }
}