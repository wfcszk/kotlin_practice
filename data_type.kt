fun main() {
    /*
        変数宣言
        val or var 変数名:データ型(省略可) = 代入する値
        データ型はコンパイラが推論して代入するため省略可能だが、後ほど変数に代入する際に誤ったデータ型の代入を防ぐため、明示的に記述した方がよい
        キャスト時はデータ型を記述する必要あり
    */

    // valは宣言時の値から変更不可（Getter）
    // 整数型
    val num: Int = 1
    println(num)
    // num = 1

    // 文字列型（\nは改行コード）
    val str: String = "Hello \n World"
    println(str)

    // トリプルクォートでエスケープの効かない生成文字列になる
    val txt = """
        kotlin practice test
        code
        """
    println(txt)

    // varは値の変更が可能（Getter,Setter）
    var num2: Int = 1
    num2 = 2
    println(num2)

    // 浮動小数点型
    var dbl: Double = 0.11111111
    println(dbl)

    // char型はシングルクォーテーションで囲む
    var chr: Char = 'A'
    println(chr)

    // $をつけると変数埋め込みが可能
    val str2 = "num = $num, num2 = $num2 result: num * num2 = ${num * num2 * 2}"
    println(str2)

    // 文字列の指定位置取得
    val c0 = str[0]
    println("str[0] : " + c0)

    // forループで1文字ずつ展開（str型としてchar型へ代入する)）
    for(chr in str) {
        println(chr)
    }

    // キャスト
    val b: Byte = 1
    // toIntでbyte⇒intへ変換して代入。その他toByte,toLong,toCharなどの変換メソッドがある
    val i: Int = b.toInt()
    print(i)

}