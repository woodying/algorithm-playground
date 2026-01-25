package codility

// https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
class FrogRiverOne {
    fun solution(X: Int, A: IntArray): Int {
        val N = A.size

        if (N < X) {
            return -1
        }

        val leafPositions = HashSet<Int>()

        A.forEachIndexed { i, elem ->
            leafPositions.add(elem)

            if (leafPositions.size == X) {
                return i
            }
        }

        return -1
    }
}
