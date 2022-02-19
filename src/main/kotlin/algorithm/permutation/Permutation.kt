package algorithm.permutation

class Permutation {
    fun permutation(numbers: IntArray): Array<IntArray> {
        val result = ArrayList<IntArray>()
        val visited = BooleanArray(numbers.size)
        val path = IntArray(numbers.size)
        var pathLength = 0

        fun backtrack(start: Int) {
            if (pathLength == numbers.size) {
                result.add(path.copyOf())
            } else {
                for (i in start until numbers.size) {
                    if (!visited[i]) {
                        visited[i] = true
                        path[pathLength++] = numbers[i]
                        backtrack(i)
                        pathLength--
                        visited[i] = false
                    }
                }
            }
        }

        backtrack(0)
        return result.toTypedArray()
    }
}