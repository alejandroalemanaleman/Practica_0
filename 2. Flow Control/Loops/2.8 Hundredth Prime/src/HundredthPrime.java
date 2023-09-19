public class HundredthPrime
{
   public static void main(String[] args)
   {
      int num = 2;
      int counter_prime = 0;
      int prime_num100 = 0;
      while (counter_prime < 100){
         for (int i = num - 1; i > 1; i--){
            if (num % i == 0){
               counter_prime ++;
               prime_num100 = num;
               break;
            }
         }

         num ++;
      }
      System.out.println(prime_num100);
   }
}