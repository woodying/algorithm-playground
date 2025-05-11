package boj

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val n = readln().toInt()

    val count = IntArray(10001)

    BufferedReader(InputStreamReader(System.`in`)).use { br ->
        repeat(n) { count[br.readLine().toInt()]++ }
    }

    BufferedWriter(OutputStreamWriter(System.out)).use { bw ->
        repeat(10001) { i ->
            repeat(count[i]) {
                bw.write("$i\n")
            }
        }
    }
}
