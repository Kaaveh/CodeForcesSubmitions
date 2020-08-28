package kotlinLan

fun main() {
    val count = readLine()!!.toInt()
    repeat(count){
        val input = readLine()!!
        println(input.filterIndexed { index, _ -> index == 0 || index % 2 != 0 })
    }
}