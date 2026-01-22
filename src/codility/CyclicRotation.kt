package codility

// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
fun solution(A: IntArray, K: Int): IntArray {
    if (A.isEmpty()) return A

    val remain = K % A.size
    val result = IntArray(A.size)

    for (i in 0..<A.size) {
        result[(i + remain) % A.size] = A[i]
    }

    return result
}
