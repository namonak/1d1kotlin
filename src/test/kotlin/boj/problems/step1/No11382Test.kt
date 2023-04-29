package boj.problems.step1

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class No11382Test : StringSpec({
    "꼬마 정민 테스트" {
        println("꼬마 정민 : https://www.acmicpc.net/problem/11382")

        // Define the test cases as a Table
        val testCases = listOf(
            row("1 2 3", "6"),
            row("1000000 1000000 1000000", "3000000"),
            row("1000000000 1000000000 1000000000", "3000000000"),
        )

        // Run each test case
        testCases.forEach { (given, expected) ->
            // Run the test
            val actual = No11382.solve(given)

            // verify the result
            actual shouldBe expected
        }
    }
})
