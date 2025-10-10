package boj.problems

import java.io.BufferedReader

class No25192 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val names = mutableSetOf<String>()
        var result = 0

        repeat(n) {
            val name = input.readLine()
            if (name == "ENTER") {
                result += names.size
                names.clear()
            } else {
                names.add(name)
            }
        }
        result += names.size

        return result.toString()
    }
}
