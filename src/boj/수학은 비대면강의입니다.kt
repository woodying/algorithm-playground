package boj

// https://www.acmicpc.net/problem/19532
fun main() {
    val inputs = readln().split(" ").map { it.toInt() }
    val a = inputs[0]
    val b = inputs[1]
    val c = inputs[2]
    val d = inputs[3]
    val e = inputs[4]
    val f = inputs[5]

    for (x in -999..999) {
        for (y in -999..999) {
            if (a * x + b * y == c && d * x + e * y == f) {
                println("$x $y")
                return
            }
        }
    }
}
