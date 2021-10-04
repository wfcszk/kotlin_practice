fun main() {

    val a: Int = 10
    val b: Int = 5
    val x: Int = 3
    val s: String = "100"
    val list = arrayOf(1, 2, 3, 5, 7)
    val y: String = "prefix_St"

    // if文
    var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println(max)

    // 別表記（参考演算子ではない）
    val maxVal = if (a > b) a else b
    println(maxVal)

    // 複数行の場合、最後の行の評価結果が値になる
    val max2 = if(a > b) {
        println("a")
        a
    } else {
        println("b")
        b
    }
    println(max2) //上記のif文の結果：10



    // when文（switch文の代替）
    // breakは不要
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> print("x is neither 1 nor 2")
    }

    // 複数の値、範囲、配列に含まれる、含まれないの判定も可
    when (x) {
        // 複数の値をコンマで区切って指定。ここでは「0または1」。
        0, 1 -> print("x == 0 or x == 1")
        // 定数でなくてもマッチさせられる
        Integer.parseInt(s) -> print("s encodes x")
        // 範囲に含まれるか
        in 2..10 -> print("x is in the range")
        // 配列などのコレクションに含まれるか
        in list -> print("x is valid")
         // 否定も使える。範囲に含まれなければ実行される。
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

    // whenもifと同様に式であり、値を返せる。
    val hasPrefix = when(y) {
    // 型チェックもできる。チェック後は自動的にキャストされる。
    // startsWith(文字列の始まり)
    is String -> y.startsWith("prefix") // yはStringとして扱える
    else -> false
    }
    println(hasPrefix)

    // 引数を与えなければif文の代わりに使える
    // isOdd 奇数, isEven 偶数
//     when {
//         x.isOdd() -> print("x is odd")
//         x.isEven() -> print("x is even")
//     else -> print("x is funny")
//         }
// }
//     fun isOdd(x: Int) = x % 2 != 0
//     fun isEven(x: Int) = x % 2 == 0

    
}
