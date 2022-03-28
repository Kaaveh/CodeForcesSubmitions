package kotlinLan

fun main() {
    repeat(readLine()!!.toInt()){
        readLine()
        val athletes = readLine()!!.split(" ").map { it.toInt() }.sorted()
        println(athletes.zipWithNext().minOf { it.second - it.first })
    }
}