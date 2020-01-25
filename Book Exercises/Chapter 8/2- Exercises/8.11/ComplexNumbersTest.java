/*
 * Author's name and email: Michael
 * Program description: Tests ComplexNumbers class.
 * Latest version: 2:32 PM, 9/6/2019.
 * Older versions: 
 */

public class ComplexNumbersTest
{
   public static void main(String[] args)
   {
		ComplexNumbers complexNumber1 = new ComplexNumbers(15, -81);
		ComplexNumbers complexNumber2 = new ComplexNumbers(52, 993);
		
		ComplexNumbers.add(complexNumber1, complexNumber2);
		
		ComplexNumbers.subtract(complexNumber1, complexNumber2);
		
		ComplexNumbers.print(complexNumber1);
		ComplexNumbers.print(complexNumber2);
		
   }
}