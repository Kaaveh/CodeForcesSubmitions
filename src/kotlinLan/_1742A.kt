package kotlinLan

fun main() {
  val len = readln().toInt()
  repeat(len) {
    val (a, b, c) = readln().split(" ").map { it.toInt() }.sorted()
    if (c == a + b) println("YES")
    else println("NO")
  }
}