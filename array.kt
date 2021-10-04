fun main() {
    // 要素[1,2,3]の配列
    val list = arrayOf(1, 2, 3)
    // null埋めされたサイズ3の配列
    var arr: Array<Int?> = arrayOfNulls(3)
    // Array<String>型で値が ["0", "1", "4", "9", "16"]の配列
    // Array(要素数, { 同じ数同士を掛け合わせる式.文字列型変換メソッド })
    val asc = Array(5, { i -> (i * i).toString() })

    // 配列の要素取り出し
    for(item in list) { print(item) }
    println()
    // 要素へのアクセス(要素の中身を変更可)
    list[0] = list[1] + list[2]
    println(list[0])

    
}