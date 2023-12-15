// Logic:
/* 1. First Initialize a Number which we want to know the number is prime or not prime number
   2. Check the divisors of given number
   3. Check if we are getting Exactly '2' divisors then it is a Prime Number or else if we get More then 2 divisors it is Not a Prime Number
*/
class Primenum{
	public static void main(String[] args){
		// Initizing number
		int num=7;
		// After the if statement inside the forloop initializing count to incrase the divisors
		int count=0;
		// Generate the Number from 1 to Given Number
		// By Using forloop
		for(int i=1;i<=num;i++){
			// We need to check the Divisor
			if(num%i==0){
				System.out.println(i);
				// We have to increase the count of divisor
				count++;
			}
		}
		// If the count is equal to 2
		if(count==2){
			System.out.println("Prime");
		}
		// Count is not equal to 2
		else{
			System.out.println("Not");
		}
	}
}