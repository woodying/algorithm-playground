package codility

// https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
class PermMissingElem {
    fun solution(A: IntArray): Int {
        val N = (A.size + 1).toLong()
        val expectedSum = N * (N + 1) / 2
        val arraySum = A.fold(0L) { acc, i -> acc + i }

        return (expectedSum - arraySum).toInt()
    }
}
