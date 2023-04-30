package boj.problems.step3

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class No25314Test : StringSpec({
    "코딩은 체육과목 입니다 테스트" {
        println("코딩은 체육과목 입니다 : https://www.acmicpc.net/problem/25314")

        // Define the test cases as a Table
        val testCases = listOf(
            row("4", "long int"),
            row("20", "long long long long long int")
        )

        // Run each test case
        testCases.forEach { (given, expected) ->
            // Run the test
            val actual = No25314.solve(given)

            // verify the result
            actual shouldBe expected
        }
    }
})
