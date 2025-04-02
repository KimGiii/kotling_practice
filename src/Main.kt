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

    // 입력 방식 변경
    val a = readln().toInt()
    val b = readln().toInt()
    // 조건 변경
    var min = if (a > b) b else a
    println("min is $min")
    // HUNGRY 출력문 삭제

    // check 함수 사용
    var someState: String? = null

    fun getStateValue(): String {

        val state = checkNotNull(someState) { "State must be set beforehand!" }
        check(state.isNotEmpty()) { "State must be non-empty!" }
        return state
    }

    someState = "ㅇ"

    // 문자열 수정
    someState = "nonEmptyState"

    println(getStateValue())

    // error 함수 사용
    val user1 = User("Alice", "admin")
    processUserRole(user1)

    val user2 = User("Bob", "guest")
    processUserRole(user2)

    // 추가할 구문

}
