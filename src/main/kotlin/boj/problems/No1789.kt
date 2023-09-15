package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1789.solve(input.readLine().toLong()).toString())

    input.close()
    output.flush()
    output.close()
}

object No1789 {
    fun solve(input: Long): Int {
        var sum = 0L
        var count = 0
        var i = 0

        while (true) {
            sum += ++i
            if (sum > input) {
                return count
            }
            count++
        }
    }
}
