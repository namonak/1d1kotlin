package boj.problems

import java.io.BufferedReader

class No11478 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val strSet = HashSet<String>()

        for (i in str.indices) {
            for (j in i + 1..str.length) {
                strSet.add(str.substring(i, j))
            }
        }

        return (strSet.size).toString()
    }
}
