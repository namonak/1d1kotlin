package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No18406Test : StringSpec({
    "럭키 스트레이트 : https://www.acmicpc.net/problem/18406" {
        val testCases = listOf(
            "123402" to "LUCKY",
            "7755" to "READY"
        )

        testCases.forEach { (given, expected) ->
            No18406().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
