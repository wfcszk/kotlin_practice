fun main() {
    // 変数宣言
    // val or var 変数名:データ型(省略可) = 代入する値
    // データ型はコンパイラが推論して代入するため省略可能だが、後ほど変数に代入する際に誤ったデータ型の代入を防ぐため、明示的に記述した方がよい
    // キャスト時はデータ型を記述する必要あり
    val num:Int = 1
    // num = 1
    val str:String = "Hello"
    var num2:Int = 1
    num2 = 2
    // valは宣言時の値から変更不可（Getter）
    // varは値の変更が可能（Getter,Setter）
    var dbl:Double = 0.11111111
    // 変数埋め込み
    val str2 = "num=$num num2=$num2  計算結果：num * num2 = ${num * num2}"


    //Output
    println(num)
    println(str)
    println(str2)
    println(num2)
    println(dbl)

}