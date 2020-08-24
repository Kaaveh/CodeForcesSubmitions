package kotlinLan

fun main() {
    val count = readLine()!!.toInt()
    var faces = 0
    var input: String

    for (i in 1..count) {
        input = readLine()!!
        faces += when (input) {
            "Tetrahedron" -> 4
            "Cube" -> 6
            "Octahedron" -> 8
            "Dodecahedron" -> 12
            else -> 20
        }
    }
    
    println(faces)
}