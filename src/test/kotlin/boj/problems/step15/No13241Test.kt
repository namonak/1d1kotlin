package boj.problems.step15

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No13241Test : StringSpec({
    "최소공배수 : https://www.acmicpc.net/problem/13241" {
        val testCases = listOf(
            "1 1" to 1,
            "3 5" to 15,
            "1 123" to 123,
            "121 199" to 24079
        )

        testCases.forEach { (given, expected) ->
            val actual = No13241.solve(BufferedReader(StringReader(given)))

            actual shouldBe expected
        }
    }
})
