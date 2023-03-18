package boj.problems.step2

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No1330Test : StringSpec({
    "두 수 비교하기 테스트" {
        println("두 수 비교하기 : https://www.acmicpc.net/problem/1330")

        // Define the test cases as a Table
        val testCases = listOf(
            row("1 2", "<"),
            row("10 2", ">"),
            row("5 5", "=="),
        )

        // Run each test case
        testCases.forEach { (given, expected) ->
            // Run the test
            val input = BufferedReader(StringReader(given))

            val actual = No1330.solve(input)

            // verify the result
            actual shouldBe expected
        }
    }
})
