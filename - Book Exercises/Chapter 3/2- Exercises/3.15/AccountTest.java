// Added display method to code in book

import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		Account account1 = new Account("Jane Green", 50.00);

		// display initial balance of each object
		Account.displayAccount(account1);

		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);

		System.out.print("Enter withdraw amount for account1: "); // prompt
		double withdrawAmount = input.nextDouble(); // obtain user input
		account1.withdraw(withdrawAmount); // add to account1's balance

		// display balances
		Account.displayAccount(account1);

	} // end main
} // end class AccountTest
