package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No9935.solve(input))

    input.close()
    output.close()
}

object No9935 {
    fun solve(input: BufferedReader): String {
        val str = input.readLine()
        val bomb = input.readLine()
        val stack = mutableListOf<Char>()
        val bombLastChar = bomb.last()

        for (char in str) {
            stack.add(char)
            if (char == bombLastChar && stack.size >= bomb.length) {
                if (stack.subList(stack.size - bomb.length, stack.size).joinToString("") == bomb) {
                    repeat(bomb.length) { stack.removeAt(stack.size - 1) }
                }
            }
        }

        return if (stack.isEmpty()) "FRULA" else stack.joinToString("")
    }
}
