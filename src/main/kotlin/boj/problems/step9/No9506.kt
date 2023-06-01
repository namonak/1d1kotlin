package boj.problems.step9

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No9506.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No9506 {
    fun solve(input: BufferedReader): String {
        val output = StringBuilder()

        while (true) {
            val number = input.readLine().toInt()
            if (number == -1) break

            val result = StringBuilder("$number = 1")
            var sum = 1
            for (i in 2 until number) {
                if (number % i == 0) {
                    result.append(" + $i")
                    sum += i
                }
            }

            if (sum == number) {
                output.append("$result\n")
            } else {
                output.append("$number is NOT perfect.\n")
            }
        }

        return output.toString().trimEnd()
    }
}
