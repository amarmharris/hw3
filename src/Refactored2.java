import java.util.Scanner;

public class Refactored2
{
        public static void main(String[] args)
        {
                double n1, n2;
                char op;
                Scanner scannerObject = new Scanner(System.in);

                //gather numbers from user
                System.out.println("Enter two numbers");
                n1 = scannerObject.nextDouble();
                n2 = scannerObject.nextDouble();

                Calculator2 calculate = new Calculator2();

                //gather operation from user
                calculate.showMenu();
                op = scannerObject.next().charAt(0);

                //loop menu if user inputs 'h' for help
                while (op == 'h')
                {
                        calculate.showHelpMenu();
                        calculate.showMenu();
                        op = scannerObject.next().charAt(0);
                }

                //create calculator object to calculate input based on operator
                calculate = new Calculator2(n1, n2, op);
                calculate.result();
        }
}

class Calculator2
{
        double a;
        double b;
        char op;

        public Calculator2(double a, double b, char op)
        {
                this.a=a;
                this.b=b;
                this.op=op;
        }

        public Calculator2(){};

        public double multiply() {return a * b;}
        public double add() {return a + b;}
        public double subtract() {return a - b;}

        public void result()
        {
                if (op == 'a') {System.out.println("The result is " + add());}
                if (op == 'm') {System.out.println("The result is " + multiply());}
                if (op == 's') {System.out.println("The result is " + subtract());}
        }

        public void showMenu() { System.out.println("Enter the letter for the desired operation. \nm: multiplication \na: addition \ns: subtraction \nEnter h for help "); }
        public void showHelpMenu() {System.out.println("----HELP---- \nEnter any of the following:\na : add\ns : subtract\nm : multiply \nNot too hard....\n------------"); }
}