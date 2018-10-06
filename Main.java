import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
      a = scan.nextInt();
        if(n > 0)
        {
            System.out.println("The given number "+a+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The given number "+a+" is Negative");
        }
        else
        {
            System.out.println("The given number "+a+" is neither Positive nor Negative ");
        }
    }
}