import java.util.ArrayList;

public class p5
{
  public static void main(String[] args)
  {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    ArrayList<Integer> numberOfFactors = new ArrayList<Integer>();

    for(int i = 2; i <= 20; i++)
    {
      if(factors.size()==0)
      {
        factors.add(i);
        numberOfFactors.add(1);
      }
      else
      {
        int tempI = i;
        for(int j = 0; j < factors.size(); j++)
        {
          int currFactors = numberOfFactors.get(j);
          while(tempI%factors.get(j)==0)
          {
            tempI = tempI/factors.get(j);
            if(currFactors>0)
            {
              currFactors = currFactors - 1;
            }
            else
            {
              numberOfFactors.set(j,numberOfFactors.get(j) + 1);
            }
          }
        }
        if(tempI>1)
        {
          factors.add(tempI);
          numberOfFactors.add(1);
        }
      }
    }

    int result = 1;
    for(int i = 0; i < factors.size(); i++)
    {
      result = result*(int)Math.pow(factors.get(i),numberOfFactors.get(i));
    }
    System.out.println(result);
  }
}
