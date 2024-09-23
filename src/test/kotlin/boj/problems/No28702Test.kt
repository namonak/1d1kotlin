package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No28702Test : StringSpec({
    "FizzBuzz : https://www.acmicpc.net/problem/28702" {
        val testCases = listOf(
            """
                Fizz
                Buzz
                11
            """.trimIndent() to "Fizz",
            """
                980803
                980804
                FizzBuzz
            """.trimIndent() to "980806",
            """
                Fizz
                7
                8
            """.trimIndent() to "Fizz",
            """
                FizzBuzz
                31
                32
            """.trimIndent() to "Fizz",
            """
                Fizz
                19
                Buzz
            """.trimIndent() to "Fizz",
            """
                Buzz
                16
                17
            """.trimIndent() to "Fizz",
            """
                1
                2
                Fizz
            """.trimIndent() to "4"
        )

        testCases.forEach { (given, expected) ->
            No28702().solve(BufferedReader(given.reader())) shouldBe expected
        }
    }
})
