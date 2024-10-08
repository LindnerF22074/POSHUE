import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int max;
    private boolean[] crossed=new boolean[max];


    public EratosthenesPrimeSieve(int max) {
        this.max = max;
    }

    @Override
    public boolean isPrime(int p) {

        boolean[] sieve =new boolean[p+1];
        for (int i=2; i<=p; i++){
            sieve[i]=false;
        }

        for (int i=2; i<=Math.sqrt(p); i++){
            if (!sieve[i]){
                for (int j=i*i; j<=p; j=j+i){
                    sieve[j]=true;
                }
            }
        }
        return !sieve[p];
    }

    @Override
    public void printPrimes() {
        String output="";
        for (int i=2;i<=max;i++){
            if(isPrime(i)){
                output=output+i+",";
            }
        }
        System.out.println("Primes from 0 to "+max+":");
        System.out.println(output.substring(0,output.length()-1));
        System.out.println();
    }

    public void calcNumbersWithPrimes(){
        System.out.println("Numbers calculated with primes: ");

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
