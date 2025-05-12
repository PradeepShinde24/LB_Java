import java.util.*;

class PrintEvenNum
{

// In this we taken the return type as void and Even number print from 0 to num
    public void printEven(int num)
    {
        System.out.printf("Even Numbers from 0 to %d: ", num);
        for(int i = 0; i<= num; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    
// In this we taken the return type as Integer and Even number print from 0 to num1
    public static int[] EvenNumbers(int num1)
    {
        int count = 0;
        for (int i = 0; i <= num1; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        int[] evenNum = new int[count];
        int index = 0;

        for (int i = 0; i <= num1; i++)
        {
            if (i % 2 == 0) {
                evenNum[index++] = i; 
            }
        }

        return evenNum; 
    }


// In this we taken the return type as Integer and Even number print from 0 to num2 but using only one for loop

    public static int EvenNumbers1(int num2)
    {
        int count = 0;

        for (int i = 0; i <= num1; i += 2)
        {
            count++;  
        }

        int[] evenNum = new int[count];
        int index = 0;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        PrintEvenNum obj = new PrintEvenNum();
        obj.printEven(number);


        int ResultEven[] = EvenNumbers(number);
        System.out.printf("Even Numbers from 1 to %d: %s",number, Arrays.toString(ResultEven)); 
        System.out.println("\n");
    }
}