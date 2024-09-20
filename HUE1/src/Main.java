import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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