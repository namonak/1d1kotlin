package boj.problems

import java.io.BufferedReader
import java.util.Stack

class No11899 {
    fun solve(input: BufferedReader): String {
        val parentheses = input.readLine() ?: ""
        val bracketStack = Stack<Char>()

        for (bracket in parentheses) {
            if (isPerfectPair(bracketStack, bracket)) {
                bracketStack.pop()
            } else {
                bracketStack.push(bracket)
            }
        }

        // 스택에 남은 괄호의 개수가 추가해야 할 최소 괄호의 개수입니다.
        return bracketStack.size.toString()
    }

    /**
     * 스택의 가장 위에 있는 괄호와 현재 조사 중인 괄호가 올바른 쌍 '()'을 형성하는지 확인합니다.
     */
    private fun isPerfectPair(
        stack: Stack<Char>,
        current: Char
    ): Boolean {
        if (stack.isEmpty()) return false

        return stack.peek() == '(' && current == ')'
    }
}
