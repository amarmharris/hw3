import java.util.Scanner;

public class Refactored1
{
        public static void main(String[] args)
        {
                double n1, n2;
                Scanner scannerObject = new Scanner(System.in);
                System.out.println("Enter two numbers");
                n1 = scannerObject.nextDouble();
                n2 = scannerObject.nextDouble();

                char operation;
                System.out.println("Enter the letter for the desired operation. \nm: multiplication \na: addition \ns: subtraction \nEnter h for help ");
                operation = scannerObject.next().charAt(0);

                while (operation == 'h')
                {
                        System.out.println("----HELP---- \nEnter any of the following:\na : add\ns : subtract\nm : multiply \nNot too hard....\n------------");
                        System.out.println("Enter the letter for the desired operation. \nm: multiplication \na: addition \ns: subtraction \nEnter h for help ");
                        operation = scannerObject.next().charAt(0);
                }
                if (operation == 'm') {System.out.println("The result is " + Calculator1.multiply(n1, n2));}
                if (operation == 'a') {System.out.println("The result is " + Calculator1.add(n1, n2));}
                if (operation == 's') {System.out.println("The result is " + Calculator1.subtract(n1, n2));}
        }
}

class Calculator1
{
        public static double multiply(double a, double b) { return a * b; }
        public static double add(double a, double b) { return a + b; }
        public static double subtract(double a, double b) { return a - b; }

}