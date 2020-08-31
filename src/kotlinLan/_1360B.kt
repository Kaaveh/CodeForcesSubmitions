package kotlinLan

fun main() {
    repeat(readLine()!!.toInt()){
        readLine()
        val athletes = readLine()!!.split(" ").map { it.toInt() }.sorted()
        println(athletes.zipWithNext().map { it.second - it.first }.min())
    }
}