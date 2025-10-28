package boj.problems

import java.io.BufferedReader

class No29766 {
    fun solve(input: BufferedReader): String {
        val text = input.readLine()
        var count = 0
        var i = 0
        while (i <= text.length - 4) {
            if (text[i] == 'D' && text[i + 1] == 'K' && text[i + 2] == 'S' && text[i + 3] == 'H') {
                count++
            }
            i++
        }
        return count.toString()
    }
}
