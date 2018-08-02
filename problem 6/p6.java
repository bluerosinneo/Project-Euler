//

public class p6
{

  public static void main(String[] args)
  {

    int sumOfSq = 0;
    int sqOfSum = 0;

    for(int i = 0 ; i <= 100 ; i++)
    {
      sumOfSq = sumOfSq + i*i;
      sqOfSum = sqOfSum + i;
    }

    sqOfSum = sqOfSum*sqOfSum;

    System.out.println(sqOfSum-sumOfSq);

    // answer might be 1058313332
  }
}
