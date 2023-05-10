package boj.problems.step5

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No5622.solve(input.readLine()).toString())

    input.close()
    output.flush()
    output.close()
}

object No5622 {
    fun solve(input: String): Int {
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

        return sum
    }
}
