package codility

import kotlin.math.max

// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
fun solution(N: Int): Int {
    val bin = N.toString(2)
    var binaryGap = 0
    var currentRecord = 0

    for (i in bin) {
        if (i == '1') {
            binaryGap = max(binaryGap, currentRecord)
            currentRecord = 0
        } else {
            currentRecord++
        }
    }

    return binaryGap
}
