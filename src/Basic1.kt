fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null) {
        println("$arg1 is not a number")
        println("작업 실패!")
        return
    }
    // y 조건 : 2 -> 3
    // 변수 오류 : 3 -> null
    if (y == null) {
        println("$arg2 is not a number")
        println("작업 실패!")

        return
    }
    // Basic - main 수정
    println(x * y)
    println("작업 성공")
}

fun main() {
    printProduct("a", "b")
    printProduct("8", "6")
    printProduct("9", "c")
}
