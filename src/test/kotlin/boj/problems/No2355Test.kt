package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2355Test : StringSpec({
    "시그마 : https://www.acmicpc.net/problem/2355" {
        val testCases = listOf(
            "1 2" to "3",
            "1 1" to "1",
            "2 1" to "3",
            "-2147483648 -2147483647" to "-4294967295",
            "1 3" to "6",
            "-3 -1" to "-6",
            "-2 2" to "0",
            "0 5" to "15",
            "2147483647 2147483647" to "2147483647",
            "-2147483648 -2147483648" to "-2147483648"
        )

        testCases.forEach { (given, expected) ->
            No2355().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
