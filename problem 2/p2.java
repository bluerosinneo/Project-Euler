

public class p2
{
  public static void main(String[] args)
  {
    int result = 0;
    int a = 1;

    int b = 2;

    int next = 0;

    while(b<4000000)
    {
      if (b%2==0)
      {
        result = result + b;
      }
      next = a + b;
      a = b;
      b = next;
    }
    System.out.println(result);
  }
}
