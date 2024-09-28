public class StringExample {
    public static void main(String[] args) {
        // 文字列の宣言と初期化
        String greeting = "こんにちは";
        String farewell = "さようなら";

        // 文字列の表示
        System.out.println(greeting);
        System.out.println(farewell);

        // 文字列の連結
        String combined = greeting + "、" + farewell;
        System.out.println(combined);

        // 文字列の長さを取得
        int length = combined.length();
        System.out.println("文字列の長さ: " + length);

        // 文字列の一部を取得
        String part = combined.substring(0, 5);
        System.out.println("部分文字列: " + part);
    }
}
