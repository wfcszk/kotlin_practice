fun main() {
    val a: Int = 1
    val b: Int = 2
    val c: Int = 1
    val d: Int = 2

    // 参照先が同じ ===、または逆 !==
    if(a === b && c !== d) {
        // 処理
    }

    // equalsメソッドによる等価性チェック ==、または逆 !=
    if(a == b && c != d) {
        // 処理
    }

    // null比較の場合、自動的に参照チェック===になる
}