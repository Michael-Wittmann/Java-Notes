/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Testing the exercises on book.
 * Latest version: 18:57 20/05/2017. Changed comments.
 * Older versions: 12:19 06/08/2016.
 */

public class DanglingElseProblem2B_C
{
   public static void main(String[] args)
   {
      int x = 5;
      int y = 8;
      
      if (y == 8)
      {
         if (x == 5)
         {
            System.out.println("@@@@@");
         }
         else
         {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
         }
      }
   }
}