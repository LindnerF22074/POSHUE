import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Type the maximum number and press enter:");
        Scanner scanner=new Scanner(System.in);
        EratosthenesPrimeSieve eratosthenesPrimeSieve=new EratosthenesPrimeSieve(scanner.nextInt());
        System.out.println();
        eratosthenesPrimeSieve.printPrimes();
        eratosthenesPrimeSieve.calcNumbersWithPrimes();
    }
}