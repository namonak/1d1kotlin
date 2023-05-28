package boj.problems.step6

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

class No25206Test : StringSpec({
    "너의 평점은 : https://www.acmicpc.net/problem/25206" {
        val testCases = listOf(
            File("src/test/kotlin/boj/problems/step6/No25206_input_1.txt").bufferedReader() to "3.284483",
            File("src/test/kotlin/boj/problems/step6/No25206_input_2.txt").bufferedReader() to "0.000000"
        )

        testCases.forEach { (given, expected) ->
            val actual = No25206.solve(given)
            actual shouldBe expected
        }
    }
})
