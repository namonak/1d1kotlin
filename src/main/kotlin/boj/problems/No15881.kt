package boj.problems

import java.io.BufferedReader

class No15881 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val itemsLine = input.readLine()

        return itemsLine.countPpapPattern().toString()
    }

    private fun String.countPpapPattern(): Int {
        var count = 0
        var i = 0
        val patternLength = 4

        while (i <= length - patternLength) {
            if (this[i] == 'p' &&
                this[i + 1] == 'P' &&
                this[i + 2] == 'A' &&
                this[i + 3] == 'p'
            ) {
                count++
                i += patternLength
            } else {
                i++
            }
        }
        return count
    }
}
