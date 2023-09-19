public class O
{
  public static void main (String[]args)
  {
    int number = 29;

    if (isEven (number))
        System.out.println ("Even");
    else
        System.out.println ("Odd");
  }


// Returns true if n is even, else odd
  static bool isEven (int number)
  {

    // n & 1 is 1, then odd, else even
    return (!(number & 1));
  }
}