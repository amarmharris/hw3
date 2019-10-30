public class arrayExcercise
{
        public static void main (String [] arguments)
        {
            int i, j;
            // Declaration of the arrays
            double [] x;
            char [][] y;

            // Initialisation of the arrays
            x = new double[3];
            y = new char[3][2];

            // Write values into array x
            x[0]=3.14;
            x[1]=-1.0;
            x[2]=2.7;

            // Write values into array y
            y[0][0]='*';
            y[0][1]='-';
            y[1][0]='-';
            y[1][1]='*';
            y[2][0]='+';
            y[2][1]='-';

            //Output array x using a for-loop
            System.out.println("****1D 'x' array values****");
            for (i=0; i < 3; i++)
            {
                System.out.println("Index: " + i + " Value: " + x[i]);
            }

            System.out.println();

            //Output array y with nested loop
            System.out.println("****2D 'y' array values****");
            for (i = 0; i < 3; i++)
            {
                for (j = 0; j < 2; j++)
                {
                    System.out.print(" '" + y[i][j] + "' ");
                }
                System.out.println();
            }

            System.out.println();

            //Print sum of values in array x calculated using an for loop
            double sum = 0;
            for(i=0;i<3;i++)
            {
                sum+= x[i];
            }
            System.out.println("The sum of the values in array 'x' is " + sum);

            //Print lowest value in array x calculated using an for loop
            double min = x[0];
            for (i = 0; i < 3; i++)
           {
               if (x[i] < min)
               {
                   min = x[i];
               }
           }
            System.out.println("The lowest value in array 'x' is " + min);
        }
}