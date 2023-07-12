package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2822Test : StringSpec({
    "점수 계산 : https://www.acmicpc.net/problem/2822" {
        val testCases = listOf(
            "20\n30\n50\n48\n33\n66\n0\n64" to "261\n3 4 5 6 8",
            "20\n0\n50\n80\n77\n110\n56\n48" to "373\n3 4 5 6 7",
            "20\n30\n50\n80\n110\n11\n0\n85" to "355\n2 3 4 5 8"
        )

        testCases.forEach { (given, expected) ->
            val actual = No2822.solve(BufferedReader(given.reader()))

            actual shouldBe expected
        }
    }
})
