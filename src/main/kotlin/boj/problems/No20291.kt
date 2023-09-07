package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No20291.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No20291 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val fileExtensions = mutableMapOf<String, Int>()
        repeat(n) {
            val fileExtension = input.readLine().split(".").last()
            fileExtensions[fileExtension] = fileExtensions.getOrDefault(fileExtension, 0) + 1
        }
        return fileExtensions.toList().sortedBy { it.first }.joinToString("\n") { "${it.first} ${it.second}" }
    }
}
