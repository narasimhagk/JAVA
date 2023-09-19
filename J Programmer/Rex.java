	

class Rex
{
   public static int Sum(int n)
   {
     if (n <= 1){ //Halting Condition
     return n;
	 }
	 else{
     return n + Sum(n - 1);
	 }
   }

   // Driver code
   public static void main(String args[])
   {
      int n = 10;
      System.out.println(Sum(n));
   }
}