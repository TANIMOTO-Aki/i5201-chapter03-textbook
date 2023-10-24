/*
 * 円の円周と面積を求めるプログラム(Circle.java)
 */
import java.io.*;

public class Circle {
    public static void main(String[] args) throws IOException {
        int r;                              // 半径
        double circ;                        // 円周を求める変数
        double area;                        // 面積を求める変数

        /* 入力の準備 */
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));

        /* 半径を整数で入力 */
        System.out.println("半径を整数で入力してください");
        r = Integer.parseInt(br.readLine());
        /* 円周を求めて表示する */
        circ = r * 2 * 3.141592;             // 円周の算出
        System.out.println("円周は" + circ);
        /* 面積を求めて表示する */
        area = r * r * 3.141592;             // 面積の算出
        System.out.println("面積は" + area);
    }
}
