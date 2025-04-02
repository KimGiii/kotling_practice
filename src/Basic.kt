fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null) {
        println("$arg1 is not a number")
        return
    }
    if (y == null) {
        println("$arg2 is not a number")
        return
    }
    println(x * y)

}

fun main() {
    printProduct("a", "b")
    printProduct("8", "6")
    printProduct("9", "c")
    println("작업 성공!")
}
