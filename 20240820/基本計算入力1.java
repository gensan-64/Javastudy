import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//キーボード入力が可能

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();//数字の読み取り
        //int num1　データ型 変数

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
                           //文字列の結果を表示
    }
}
