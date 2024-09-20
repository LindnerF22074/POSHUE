public class EratosthenesPrimeSieve implements PrimeSieve{
    private int max=10;
    private boolean[] crossed=new boolean[max];



    @Override
    public boolean isPrime(int p) {

    }

    @Override
    public void printPrimes() {
        for (int i=2;i<=max;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
