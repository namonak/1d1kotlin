package boj.problems

import java.io.BufferedReader

class No30958 {
    fun solve(input: BufferedReader): String {
        input.readLine().toInt()
        val s = input.readLine().filterNot { it in " ,." }
        val sortedFrequency = s.groupingBy { it }.eachCount().values.sortedDescending()
        return sortedFrequency.first().toString()
    }
}
