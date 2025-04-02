class User(val name: String, val role: String)

fun processUserRole(user: User) {
    when (user.role) {
        "admin" -> println("${user.name} is an admin.")
        "editor" -> println("${user.name} is an editor.")
        "viewer" -> println("${user.name} is a viewer.")
        else -> error("Undefined role: ${user.role}")
    }
}

fun main() {

    val items = listOf("apple", "banana", "kiwi", "pineapple", "orange")

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    val a = readln()
    val b = readln()
    var max = if (a > b) a else b
    println("max is $max")
    println("HUNGRY")

    // check 함수 사용
    var someState: String? = null

    fun getStateValue(): String {

        val state = checkNotNull(someState) { "State must be set beforehand!" }
        check(state.isNotEmpty()) { "State must be non-empty!" }
        return state
    }

    someState = "ㅇ"

    someState = "non-empty-state"

    println(getStateValue())

    // error 함수 사용
    val user1 = User("Alice", "admin")
    processUserRole(user1)

    val user2 = User("Bob", "guest")
    processUserRole(user2)

}
