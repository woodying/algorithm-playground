package codility

// https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
fun solution(X: Int, Y: Int, D: Int): Int {
    val distance = Y - X

    if (distance == 0) {
        return 0
    }

    return (distance - 1) / D + 1
}
