package codility

import kotlin.math.*

// https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
class TapeEquilibrium {
    fun solution(A: IntArray): Int {
        var partA = 0
        var partB = A.sum()

        var minDiff = Integer.MAX_VALUE
        for (i in 0 ..< A.size - 1) {
            partA += A[i]
            partB -= A[i]

            minDiff = min(minDiff, abs(partA - partB))
        }

        return minDiff
    }
}
