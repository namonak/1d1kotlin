package boj.problems

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2747.solve(input.readLine().toInt()).toString())

    input.close()
    output.flush()
    output.close()
}

object No2747 {
    fun solve(input: Int): Int {
        val dp = IntArray(46)

        dp[1] = 1
        for (i in 2..input) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp[input]
    }
}
