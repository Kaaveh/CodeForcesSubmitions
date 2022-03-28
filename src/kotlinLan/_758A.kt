package kotlinLan

fun main() {
    readLine()!!
    val citizens = readLine()!!
        .split(" ").map { it.toInt() }
    val max = citizens.maxOrNull()!!
    println(citizens.sumOf { max - it })
}