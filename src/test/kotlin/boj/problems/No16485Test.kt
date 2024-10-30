package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No16485Test : StringSpec({
    "작도하자! - ② : https://www.acmicpc.net/problem/16485" {
        val testCases = listOf(
            "9 3" to "3.0",
            "15 7" to "2.142857142857143"
        )

        testCases.forEach { (input, output) ->
            No16485().solve(BufferedReader(input.reader())) shouldBe output
        }
    }
})
