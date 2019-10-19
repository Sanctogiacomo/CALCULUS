using System;

namespace squareroot
{
    class Program
    {
        static void Main(string[] args)
        {
            int count = 1;
            //int conVertedNum;
            int y = 0;
            Console.WriteLine("WELCOME TO A PROGRAMME TO CALULATE THE SQUARE ROOT OF NUMBERS");
            for (count = 1; count<=3;){
                Console.WriteLine("ENTER YOUR FIRST NAME PLEASE!:");
                Console.WriteLine("PLEASE ENTER THE VALUE OF X:");	
                String x = Console.ReadLine();
                int.TryParse(x, out int ConV);
                y = (int)(Math.Sqrt(ConV));
                Console.WriteLine("THE VALUE OF YOUR SQUARE ROOT IS " +y);
                count++;
            }
            if (count==3){
                Console.WriteLine("THANKS FOR USING THIS CALCULATOR. TO CALULATE THE SQUAREROOT OF ANY NUMBER AGAIN PLEASE RERUN THE PROGRAMME");
            }
            else{
                Console.WriteLine("THANKS FOR USING THIS CALCULATOR. TO CALULATE THE SQUAREROOT OF ANY NUMBER RERUN THE PROGRAMME");
            }
            
        }
    }
}
