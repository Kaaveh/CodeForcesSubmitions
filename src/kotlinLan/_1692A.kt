package kotlinLan

fun main() {
  val round = readln().toInt()
  repeat(round) {
    val (t, a, b, c) = readln().split(" ").map { it.toInt() }
    var output = 0
    if (t < a) output++
    if (t < b) output++
    if (t < c) output++
    println(output)
  }
}