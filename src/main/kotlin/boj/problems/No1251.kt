package boj.problems

import java.io.BufferedReader

class No1251 {
    fun solve(input: BufferedReader): String {
        val word = input.readLine()
        val answer = mutableListOf<String>()
        for (i in 1 until word.length - 1) {
            for (j in i + 1 until word.length) {
                answer.add(word.take(i).reversed() + word.substring(i, j).reversed() + word.substring(j).reversed())
            }
        }
        return answer.sorted()[0]
    }
}
