import java.util.Scanner;

public class IT24102913Lab5Q1
 {
          public static void main(String[] args) 
	{
	         int num1, num2, num3, largest, smallest;
             Scanner scanner = new Scanner(System.in);   
             System.out.print("Enter the first integer: ");
             num1 = scanner.nextInt();
             System.out.print("Enter the second integer: ");
             num2 = scanner.nextInt();
             System.out.print("Enter the third integer: ");
             num3 = scanner.nextInt();           
             System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);           
             smallest = num1;
             largest = num1;           
             if (num2 < smallest)
			 {
             smallest = num2;
             }
             if (num3 < smallest)
			 {
             smallest = num3;
             }
             if (num2 > largest)
			 {
             largest = num2;
             }
             if (num3 > largest)
			 {
             largest = num3;
             }
             System.out.println("The Smallest number is: " + smallest);
             System.out.println("The Largest number is: " + largest);
    }
}
