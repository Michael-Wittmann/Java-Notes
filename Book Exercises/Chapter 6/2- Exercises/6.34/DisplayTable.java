/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Prints a table that shows decimal. binary, octal, hexa 
 *  versions of numbers 1-256.
 * Latest version: 17:16 07/02/2019. Made putput more tidy.
 * Older versions: 13:19 04/07/2017.
 */

import java.util.Scanner;

public class DisplayTable
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      for (int counter = 1; counter <= 256; counter++)
      {
         System.out.printf("%8s %3d   %7s %9d   %6s %3o   %12s %3x%n", "Decimal:", 
				counter, "Binary:", convertToBinary(counter) , "Octal:", counter , 
				"Hexadecimal:", counter);
			//System.out.printf("%8s %3d   %7s %9s   %6s %3o   %12s %3x%n", "Decimal:", 
			//	counter, "Binary:", Integer.toString(counter, 2) , "Octal:", counter , 
			//	"Hexadecimal:", counter);
      }
   }
   
   private static int convertToBinary(int decimalNumber)
   {
      int result = 0;
      int multiplier = 1;
      
      while(decimalNumber > 0)
      {
        int residue = decimalNumber % 2; // Write base instead of 2
        decimalNumber = decimalNumber / 2; // Write base instead of 2
        result += residue * multiplier;
        multiplier = multiplier * 10;
      }
		
      return result;
   }
}