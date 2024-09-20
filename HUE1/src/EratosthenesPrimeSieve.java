import java.util.ArrayList;
import java.util.List;

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
        return !sieve[p];
    }

    @Override
    public void printPrimes() {
        for (int i=2;i<=max;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public void calcNumbersWithPrimes(){
        List<Integer> primes=new ArrayList<>();
        for (int i=2;i<=max;i++){
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        for (int i=4;i<=max;i=i+2){
            exitpoint:
            for (int j=0;j<primes.size();j++){
                for (int k=0;k<primes.size();k++){
                    if ((primes.get(j)+primes.get(k))==i){
                        System.out.println(primes.get(j)+"+"+primes.get(k)+"="+i);
                        break exitpoint;
                    }
                }
            }
        }
    }
}
