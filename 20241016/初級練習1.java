import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("3つの整数を入力してください。");

        System.out.print("1つ目の整数：");
        int num1 = scanner.nextInt();

        System.out.print("2つ目の整数：");
        int num2 = scanner.nextInt();

        System.out.print("3つ目の整数：");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("合計は：" + sum);
    }
}
