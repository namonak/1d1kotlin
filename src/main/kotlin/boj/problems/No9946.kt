package boj.problems

import java.io.BufferedReader

class No9946 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        var case = 1

        while (true) {
            val original = input.readLine()
            val mixed = input.readLine()

            if (original == "END" && mixed == "END") break

            result.append("Case $case: ")
            result.append(if (sortStringAlphabetically(original) == sortStringAlphabetically(mixed)) "same" else "different")
            result.append("\n")

            case++
        }

        return result.toString().trimEnd()
    }

    private fun sortStringAlphabetically(input: String): String {
        return input.toList().sorted().joinToString("")
    }
}
