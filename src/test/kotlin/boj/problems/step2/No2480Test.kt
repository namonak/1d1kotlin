package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No2480Test : StringSpec({
    "주사위 세개 테스트" {
        println("주사위 세게 : https://www.acmicpc.net/problem/2480")

        // Define the test cases as a Table
        val testCases = listOf(
            row("3 3 6", 1300),
            row("2 2 2", 12000),
            row("6 2 5", 600),
        )

        // Run each test case
        testCases.forEach { (given, expected) ->
            // Run the test
            val input = BufferedReader(StringReader(given))

            val actual = No2480.solve(input)

            // verify the result
            actual shouldBe expected
        }
    }
})
