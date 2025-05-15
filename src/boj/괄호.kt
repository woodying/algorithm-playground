package boj

// https://www.acmicpc.net/problem/9012
fun main() {
    val t = readln().toInt()

    val br = System.`in`.bufferedReader()
    repeat(t) {
        val s = br.readLine()
        val stack = mutableListOf<Char>()

        for (c in s) {
            if (c == '(') {
                stack.add(c)
                continue
            }

            if (stack.isEmpty()) {
                println("NO")
                return@repeat
            }

            stack.removeLast()
        }

        if (stack.isNotEmpty()) {
            println("NO")
            return@repeat
        }

        println("YES")
    }
}
