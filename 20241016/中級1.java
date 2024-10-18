import java.util.Scanner;

public class SimplePrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("入力数値：");
        int number = scanner.nextInt();
        int originalNumber = number;

        String factors = "";
        int count = 0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors += i + " ";
                number /= i;
                count++;
            }
        }

        System.out.println(originalNumber + " の素因数分解の結果：" + count + " 個の素数(" + factors.trim() + ")");
    }
}
