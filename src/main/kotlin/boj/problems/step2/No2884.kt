package boj.problems.step2

import java.io.*
import java.util.*

object No2884 {
    private const val PRESET_TIME = 45
    private const val MIDNIGHT = 0
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
        if (minute < PRESET_TIME) {
            if (hour == MIDNIGHT) {
                hour = 23
            } else {
                hour--
            }
            minute = minute + 60 - PRESET_TIME
            return "$hour $minute"
        }
        return hour.toString() + " " + (minute - PRESET_TIME)
    }
}
