package kotlinLan

fun main() {
    val teams = mutableListOf<String>()
    repeat(readLine()!!.toInt()){
        teams.add(readLine()!!)
    }
    val result = teams.groupBy { it }.maxByOrNull { it.value.size }?.key!!
    println(result)
}