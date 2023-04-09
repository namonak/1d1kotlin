package boj.problems.step7

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No2292Test : StringSpec() {
    init {
        "벌집 테스트" {
            println("벌집 : https://www.acmicpc.net/problem/2292")

            val testCases = listOf(
                row(13, 3),
                row(1, 1),
                row(2, 2),
                row(7, 2),
                row(5, 2),
                row(37, 4),
                row(38, 5),
                row(64, 6)
            )

            testCases.forEach { (input, expected) ->
                val actual = No2292.solve(BufferedReader(StringReader(input.toString())))
                actual shouldBe expected
            }

        }
    }
}
