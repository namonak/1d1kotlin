package boj.problems

import java.io.BufferedReader
import java.util.ArrayDeque

class No15815 {
    fun solve(input: BufferedReader): String {
        val expression = input.readLine()
        val stack = ArrayDeque<Int>()

        for (char in expression) {
            if (char.isDigit()) {
                // 피연산자(숫자)는 스택에 넣습니다.
                stack.push(char.digitToInt())
            } else {
                // 연산자를 만나면 스택에서 두 수를 꺼내 계산합니다.
                // 주의: 스택은 후입선출이므로 먼저 꺼낸 값이 두 번째 피연산자(뒤쪽 숫자)입니다.
                val operand2 = stack.pop()
                val operand1 = stack.pop()

                val result = calculate(operand1, operand2, char)
                stack.push(result)
            }
        }

        // 최종 계산 결과 반환
        return stack.pop().toString()
    }

    private fun calculate(
        operand1: Int,
        operand2: Int,
        operator: Char
    ): Int {
        return when (operator) {
            '+' -> operand1 + operand2
            '-' -> operand1 - operand2
            '*' -> operand1 * operand2
            '/' -> operand1 / operand2
            else -> throw IllegalArgumentException("지원하지 않는 연산자입니다: $operator")
        }
    }
}
