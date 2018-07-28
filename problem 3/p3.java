import java.util.List;
import java.util.ArrayList;

public class p3
{
  public static void main(String[] args)
  {
    long findLargestPrimeFactor = 600851475143L;
    List<Long> primeList = new ArrayList<Long>();

    long largestPrimeFactor = 0;
    long numberToTry = 1;

    primeList.add(2L);

    // Math.sqrt(findLargestPrimeFactor)
    while (numberToTry < Math.sqrt(findLargestPrimeFactor))
    {
      numberToTry = numberToTry + 2;
      boolean prime = true;
      for (int i = 0; i < primeList.size(); i++)
      {
        if(numberToTry%primeList.get(i)==0)
        {
          prime = false;
        }
      }
      if(prime == true)
      {
        primeList.add(numberToTry);
        if(findLargestPrimeFactor%numberToTry==0)
        {
          largestPrimeFactor = numberToTry;
        }
      }


    }

    System.out.println(largestPrimeFactor);
  }
}
