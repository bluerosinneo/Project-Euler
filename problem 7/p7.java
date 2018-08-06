import java.util.ArrayList;

public class p7
{
  public static void main(String[] args)
  {
    ArrayList<Integer> primeList = new ArrayList<Integer>();

    int numberToTry = 1;

    primeList.add(2);

    while(primeList.size()<=10001)
    {
      numberToTry = numberToTry + 1;

      boolean itIsPrime = true;

      for(int i = 0 ; i < primeList.size() ; i++)
      {
        if(numberToTry%primeList.get(i)!=0)
        {

        }
        else
        {
          itIsPrime = false;
        }
      }

      if(itIsPrime == true)
      {
        primeList.add(numberToTry);
      }
    }

    System.out.println(primeList.get(10001-1));
  }
}
