public class HundredthPrime {
   public static void main(String[] args) {
      int num = 2;
      int counter_prime = 0;
      int prime_num100 = 0;

      while (counter_prime < 100) {
         boolean isPrime = true; // Assume num is prime initially

         for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
               isPrime = false;
               break;
            }
         }

         if (isPrime) {
            counter_prime++;
            prime_num100 = num;
         }

         num++;
      }

      System.out.println(prime_num100);
   }
}
