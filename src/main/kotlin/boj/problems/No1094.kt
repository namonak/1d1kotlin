package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1094.solve(input.readLine().toInt()).toString())

    input.close()
    output.flush()
    output.close()
}

object No1094 {
    fun solve(input: Int): Int {
        var n = input
        var count = 0
        while (n > 0) {
            if (n % 2 == 1) {
                count++
            }
            n /= 2
        }
        return count
    }
}
