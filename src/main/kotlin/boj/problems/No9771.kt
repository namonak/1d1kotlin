package boj.problems

import java.io.BufferedReader

class No9771 {
    fun solve(input: BufferedReader): String {
        val wordToSearch = input.readLine().trim()
        var count = 0

        input.forEachLine { line ->
            var index = line.indexOf(wordToSearch)
            while (index != -1) {
                count++
                index = line.indexOf(wordToSearch, index + wordToSearch.length)
            }
        }

        return count.toString()
    }
}
