package boj

// https://www.acmicpc.net/problem/10989
fun main() {
    val n = readLine()!!.toInt()

    val count = IntArray(10001)
    repeat(n) {
        count[readLine()!!.toInt()]++
    }

    count.forEachIndexed { number, frequency ->
        repeat(frequency) {
            println(number)
        }
    }
}
