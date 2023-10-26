package boj.problems

import java.io.BufferedReader

fun main() = println(No9375.solve(System.`in`.bufferedReader()))

object No9375 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()
        repeat(t) {
            val n = input.readLine().toInt()
            val clothes = mutableMapOf<String, Int>()
            repeat(n) {
                val (name, type) = input.readLine().split(" ")
                clothes[type] = clothes.getOrDefault(type, 0) + 1
            }
            var answer = 1
            for (value in clothes.values) {
                answer *= (value + 1)
            }
            result.append(answer - 1).append("\n")
        }
        return result.toString().trim()
    }
}
