package leetcode.problems.lv0easy

import java.util.Stack

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val range = (1..2)
        s.forEach { c ->
            when {
                stack.empty() -> stack.push(c)
                (c - stack.peek()) in range -> stack.pop()
                else -> stack.push(c)
            }
        }
        return stack.empty()
    }
}
