import java.util.Scanner;

public class SuperSimpleMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("3つの整数を入力してください。");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("最大値は：" + max);
    }
}
