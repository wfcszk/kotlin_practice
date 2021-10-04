fun main() {
    // Listの中身を変更できない
    val list = listOf(1, 2, 3, 4, 5)
    // list[0] = list[1] + list[2]:エラー

    // MutableList<Int>,中身を変更可
    val mlist = mutableListOf(1, 2, 3, 4, 5)
    mlist[0] = mlist[1] + mlist[2]

    // Mapの中身を変更できない
    val map = mapOf(1 to "A", 2 to "B")
    // map[1] = "C" :エラー

    // MutableMap<Int, String>,中身を変更可
    val mmap = mutableMapOf(1 to "A", 2 to "B")
    mmap[1] = "C"


}