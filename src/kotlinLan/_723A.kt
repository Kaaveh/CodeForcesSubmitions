package kotlinLan

fun main() {
  val (a, _, c) = readln().split(" ").map { it.toInt() }.sorted()
  val dist = c - a
  println(dist)
}