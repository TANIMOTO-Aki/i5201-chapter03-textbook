import java.io.*;

public class TriArea {
    public static void main(String[] args) throws IOException {
        int base;                                   // 変数の宣言（底辺）
        int height;                                 // 変数の宣言（高さ）
        int area;                                   // 変数の宣言（面積）

        /* 入力の準備 */
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));

        /* 底辺の長さの入力 */
        System.out.println("底辺の長さを入力してください");
        base = Integer.parseInt(br.readLine());             //底辺の値を入力
        
        /* 高さの入力 */
        System.out.println("高さを入力してください");
        height = Integer.parseInt(br.readLine());             //高さの値を入力

        /* 面積を求めて表示 */
        area = base * height / 2 ;
        System.out.println("面積は" + area);
    }
}
