public class p4
{
  public static void main(String[] args)
  {

    int n = 0;
    int result = 0;
    for(int i = 999; i>0; i--)
    {
      if((i*999)<result)
      {
        break;
      }
      for(int j = 999; j>0; j--)
      {
        n = i*j;
        if(ispalindrome(Integer.toString(n))&(n>result))
        {
          result = n;
        }
      }
    }
    System.out.println(result);
  }

  static boolean ispalindrome(String number)
  {
    boolean result = true;
    int numberLength = number.length();
    if(numberLength%2==0)
    {
      for(int i = 0; i<numberLength; i++)
      {

        if(number.charAt(i)!=number.charAt(numberLength-1-i))
        {
          result = false;
          break;
        }
        if((i+1)==(numberLength-1-i))
        {
          break;
        }
      }
    }
    else
    {
      for(int i = 0; i<numberLength; i++)
      {

        if(number.charAt(i)!=number.charAt(numberLength-1-i))
        {
          result = false;
          break;
        }
        if((i+2)==(numberLength-1-i))
        {
          break;
        }
      }
    }
    return result;
  }
}
