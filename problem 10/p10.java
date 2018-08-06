
public class p10{
  public static void main(String[] args){
    int[] intSieve = new int[2000001];

    for(int i = 0; i< intSieve.length ; i++){
      intSieve[i]=1;
    }

    // 0 is not prime
    intSieve[0] = 0;
    intSieve[1] = 0;

    for(int i = 0 ; i < intSieve.length ; i++ ){
      //System.out.println(i);
      if(i >= (intSieve.length/2) ){
        break;
      }

      if(intSieve[i]==1){
        int n = 2;
        while(i*n < intSieve.length){
          //System.out.println(intSieve[i]*n);
          intSieve[i*n]=0;
          n = n + 1;
        }
      }
    }

    long result = 0;

    for(int i = 0 ; i < intSieve.length ; i++ ){
      //System.out.println(i + " : " + intSieve[i]);
      if(intSieve[i]==1){
        result = result + i;
      }
    }
    System.out.println(result);


  }
}
