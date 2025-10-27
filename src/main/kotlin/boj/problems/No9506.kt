package boj.problems

import java.io.BufferedReader

class No9506 {
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
