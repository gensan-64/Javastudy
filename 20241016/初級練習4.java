import java.util.Scanner;

public class SimpleFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("正の整数 N を入力してください：");
        int N = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.print(num1 + " " + num2);

        for (int i = 2; i < N; i++) {
            int nextNum = num1 + num2;
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}
