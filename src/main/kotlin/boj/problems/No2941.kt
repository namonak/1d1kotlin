package boj.problems

import java.io.BufferedReader

class No2941 {
    private val croatianAlphabetArray = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    fun solve(input: BufferedReader): String {
        var result = input.readLine()

        croatianAlphabetArray.forEach { word ->
            result = result.replace(word, "0")
        }

        return result.length.toString()
    }
}
