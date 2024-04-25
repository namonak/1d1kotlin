package boj.problems

import java.io.BufferedReader

class No1543 {
    fun solve(input: BufferedReader): String {
        val document = input.readLine()
        val word = input.readLine()
        var count = 0
        var index = 0

        while (index <= document.length - word.length) {
            if (document.substring(index, index + word.length) == word) {
                count++
                index += word.length
            } else {
                index++
            }
        }

        return count.toString()
    }
}
