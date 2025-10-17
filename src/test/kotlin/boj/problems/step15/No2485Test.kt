package boj.problems.step15

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2485Test : StringSpec({
    "가로수 : https://www.acmicpc.net/problem/2485" {
        val testCases = listOf(
            "4\n1\n3\n7\n13" to "3",
            "4\n2\n6\n12\n18" to "5",
        )

        testCases.forEach { (given, expected) ->
            val actual = No2485().solve(BufferedReader(given.reader()))
            actual shouldBe expected
        }
    }
})
