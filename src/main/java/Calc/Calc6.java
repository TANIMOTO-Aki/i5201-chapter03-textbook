public class Calc6 {
    public static void main(String[] args) {
        int ans;                    // 結果の格納エリア
        int valA, valB;             // 処理データ

        valA = 5;                   // ①ans=不定　valA=5　valB=不定
        valB = valA;                // ②ans=不定　valA=5　valB=5
        ans = valA + valB;          // ③ans=10　valA=5　valB=5
        valA = ans * 2;             // ④ans=10　valA=20　valB=5
        ans = valA + valB;          // ④ans=25　valA=20　valB=5
        ans = ans * 2;              // ④ans=50　valA=20　valB=5

        System.out.println("ans = " + ans);
    }
}
/*
 * 実行結果
 * ans = 50
 */