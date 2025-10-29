package boj.problems

import java.io.BufferedReader

class No2744 {
    fun solve(input: BufferedReader): String {
        return input.readLine().map {
            if (it.isUpperCase()) it.lowercaseChar() else it.uppercaseChar()
        }.joinToString("")
    }
}
