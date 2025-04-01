fun main() {

    val items = listOf("apple", "banana", "kiwi")

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    val a = readln()
    val b = readln()
    var max = if (a > b) a else b
    println("max is $max")

}
