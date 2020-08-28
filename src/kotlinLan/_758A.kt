package kotlinLan

fun main() {
    readLine()!!
    val citizens = readLine()!!
        .split(" ").map { it.toInt() }
    val max = citizens.max()!!
    println(citizens.map { max - it }.sum())
}