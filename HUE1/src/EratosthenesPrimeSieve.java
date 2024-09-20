public class EratosthenesPrimeSieve implements PrimeSieve{
    private int max=10;
    private boolean[] crossed=new boolean[max];



    @Override
    public boolean isPrime(int p) {

        boolean[] sieve =new boolean[p+1];
        for (int i=2;i<=p;i++){
            sieve[i]=false;
        }

        for (int i=2;i<=Math.sqrt(p);i++){
            if (!sieve[i]){
                for (int j=i*i;j<=p;j=j+i){
                    sieve[j]=true;
                }
            }
        }
        return sieve[p];
    }

    @Override
    public void printPrimes() {
        for (int i=2;i<=max;i++){
            if(!isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
