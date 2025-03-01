package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1064Test : StringSpec({
    "평행사변형 : https://www.acmicpc.net/problem/1064" {
        val testCases = listOf(
            "0 0 0 1 1 0" to "0.8284271247461898",
            "0 0 4 0 0 3" to "4.0",
            "0 0 1 0 47 0" to "-1.0",
            "1 2 3 4 8 7" to "11.547796284592874",
            "2 -1 -7 2 -1 0" to "-1.0"
        )

        testCases.forEach { (given, expected) ->
            val result = No1064().solve(BufferedReader(given.reader())).toDouble()
            val expectedDouble = expected.toDouble()
            result shouldBe (expectedDouble plusOrMinus 1e-9)
        }
    }
})
