package boj

// https://www.acmicpc.net/problem/15649
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val visited = BooleanArray(n + 1)
    val result = IntArray(m)

    fun dfs(depth: Int) {
        if (depth == m) {
            println(result.joinToString(" "))
            return
        }

        for (i in 1..n) {
            if (!visited[i]) {
                visited[i] = true
                result[depth] = i
                dfs(depth + 1)
                visited[i] = false
            }
        }
    }

    dfs(0)
}
