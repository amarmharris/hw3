import java.util.Scanner;

public class Calculator
{
    public static void main (String [] arguments)
    {
        double n1, n2;
        char operation;
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = scannerObject.nextDouble();
        n2 = scannerObject.nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter the letter for the desired operation. \nm: multiplication \na: addition \ns: subtraction \nEnter h for help ");
        operation = op.next().charAt(0);

        while (operation == 'h') {
            System.out.println("----HELP---- \nEnter any of the following:\na : add\ns : subtract\nm : multiply \nNot too hard....");
            System.out.println("Enter the letter for the desired operation. \nm: multiplication \na: addition \ns: subtraction \nEnter h for help ");
            operation = op.next().charAt(0);
        }
        if (operation == 'm') {
            double result = n1 * n2;
            System.out.println("The result is " + result);
        }
        if (operation == 'a') {
            double result2 = n1 + n2;
            System.out.println("The result is " + result2);
        }
        if (operation == 's') {
            double result3 = n1 - n2;
            System.out.println("The result is " + result3);
        }

    }
}