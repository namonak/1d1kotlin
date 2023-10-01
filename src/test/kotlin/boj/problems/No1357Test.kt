package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1357Test : StringSpec({
    "뒤집힌 덧셈 : https://www.acmicpc.net/problem/1357" {
        val testCases = listOf(
            "123 100" to 223,
            "111 111" to 222,
            "5 5" to 1,
            "1000 1" to 2,
            "456 789" to 1461
        )

        testCases.forEach { (input, output) ->
            No1357.solve(input.byteInputStream().bufferedReader()) shouldBe output
        }
    }
})
