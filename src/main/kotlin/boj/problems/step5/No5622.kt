package boj.problems.step5

object No5622 {
    fun solve(input: String): String {
        var sum = 0

        input.forEach {
            sum += when (it) {
                'A', 'B', 'C' -> 3
                'D', 'E', 'F' -> 4
                'G', 'H', 'I' -> 5
                'J', 'K', 'L' -> 6
                'M', 'N', 'O' -> 7
                'P', 'Q', 'R', 'S' -> 8
                'T', 'U', 'V' -> 9
                'W', 'X', 'Y', 'Z' -> 10
                else -> 0
            }
        }

        return sum.toString()
    }
}
