package boj.problems.step2

import java.io.*
import java.util.*

object No2525 {
    private const val ONE_HOUR = 60
    private const val ONE_DAY = 24
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val input = BufferedReader(InputStreamReader(System.`in`))
        val output = BufferedWriter(OutputStreamWriter(System.out))
        output.write(
            """
                ${solve(input)}
                
                """.trimIndent()
        )
        input.close()
        output.flush()
        output.close()
    }

    @Throws(IOException::class)
    fun solve(input: BufferedReader): String {
        val st = StringTokenizer(input.readLine())
        var hour = st.nextToken().toInt()
        var minute = st.nextToken().toInt()
        val timeToAdd = input.readLine().toInt()
        minute += timeToAdd
        if (minute >= ONE_HOUR) {
            hour += minute / ONE_HOUR
            minute %= ONE_HOUR
        }
        if (hour >= ONE_DAY) {
            hour %= ONE_DAY
        }
        return "$hour $minute"
    }
}
