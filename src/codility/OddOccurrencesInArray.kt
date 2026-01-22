package codility

// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
fun solution(A: IntArray): Int {
    return A.reduce { acc, i -> acc xor i }
}
