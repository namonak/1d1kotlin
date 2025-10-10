package boj.problems

import java.io.BufferedReader

class No2776 {
    fun solve(input: BufferedReader): String {
        val output = StringBuilder()
        val t = input.readLine().toInt()

        repeat(t) {
            input.readLine().toInt()
            val note1 = input.readLine().split(" ").map { it.toInt() }.toSet()
            input.readLine().toInt()
            val note2 = input.readLine().split(" ").map { it.toInt() }

            note2.forEach { num ->
                if (note1.contains(num)) {
                    output.append("1\n")
                } else {
                    output.append("0\n")
                }
            }
        }

        return output.toString().trim()
    }
}
