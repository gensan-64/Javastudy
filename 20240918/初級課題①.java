import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        // Scannerオブジェクトの作成
        Scanner scanner = new Scanner(System.in);

        // ユーザーからの入力を受け取る
        System.out.println("1つ目の文字列を入力してください:");
        String firstString = scanner.nextLine();

        System.out.println("2つ目の文字列を入力してください:");
        String secondString = scanner.nextLine();

        // 文字列の結合
        String combinedString = firstString + secondString;

        // 結果を表示
        System.out.println("結合された文字列: " + combinedString);

        // Scannerを閉じる
        scanner.close();
    }
}
