package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2839Test : StringSpec({
    "설탕 배달 : https://www.acmicpc.net/problem/2839" {
        val testCases = listOf(
            "18" to "4",
            "4" to "-1",
            "6" to "2",
            "9" to "3",
            "11" to "3",
        )

        testCases.forEach { (given, expected) ->
            No2839().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
