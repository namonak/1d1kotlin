package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11283Test : StringSpec({
    "한글 2 : https://www.acmicpc.net/problem/11283" {
        val testCases = listOf(
            "가" to "1",
            "힣" to "11172",
            "백" to "4146",
            "준" to "7425"
        )

        testCases.forEach { (given, expected) ->
            No11283().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
