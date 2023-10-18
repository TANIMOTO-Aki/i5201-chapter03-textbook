public class DateType01 {
    public static void main(String[] args) {
        byte byteval;                       //  8ビットの整数
        short shortval;                     //  16ビットの整数
        int intval;                         //  32ビットの整数
        long longval;                       //  64ビットの整数

        longval = 2147483648;               //① 大きすぎる値
        longval = 2147483648L;              //② Lを付けた場合（エラーにならない）

        byteval = 128;                      //③ 範囲を超えた値

        shortval = 256;                     //④ サイズが違う変数の代入
        intval = shortval;                  //⑤ 拡張変換（エラーにならない）
        shortval = intval;                  //⑥ 縮小返還
        shortval = (short)intval;           //⑦ 縮小返還　キャスト（エラーにならない）
    }
}
