package boj.problems

import java.io.BufferedReader
import java.util.ArrayDeque

class No7585 {
    private val pairs = mapOf(
        ')' to '(',
        ']' to '[',
        '}' to '{'
    )

    private val openBrackets = pairs.values
    private val closeBrackets = pairs.keys

    fun solve(input: BufferedReader): String {
        return input.lineSequence()
            .takeWhile { it != "#" }.joinToString("\n") { line ->
                if (isValidBrackets(line)) "Legal" else "Illegal"
            } // 결과들을 개행문자로 합쳐서 반환
    }

    private fun isValidBrackets(line: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (char in line) {
            when (char) {
                in openBrackets -> stack.addLast(char) // Push
                in closeBrackets -> {
                    if (stack.isEmpty()) return false

                    val lastOpen = stack.removeLast() // Pop
                    if (lastOpen != pairs[char]) {
                        return false // 짝이 맞지 않음
                    }
                }
                // 그 외 문자는 무시
            }
        }

        // 스택이 비어있어야 모든 괄호가 닫힌 것임
        return stack.isEmpty()
    }
}
