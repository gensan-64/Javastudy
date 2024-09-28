import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        // Scannerオブジェクトの作成
        Scanner scanner = new Scanner(System.in);

        // ユーザーからの入力を受け取る
        System.out.println("1つ目の文字列を入力してください:");
        String str1 = scanner.nextLine();

        System.out.println("2つ目の文字列を入力してください:");
        String str2 = scanner.nextLine();
        
        //比較演算
        if(str1.equals(str2)==true){
            System.out.println(str1);
        }else{
        // 文字列の結合
        String combinedString = str1 + str2;

        // 結果を表示
        System.out.println("結合された文字列: " + combinedString);
        }

        // Scannerを閉じる
        scanner.close();
    }
}
