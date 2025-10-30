package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No27930Test : StringSpec({
    "당신은 운명을 믿나요? : https://www.acmicpc.net/problem/27930" {
        val testCases = listOf(
            "KOYONSEREAI" to "KOREA",
            "YYOONNSSEEII" to "YONSEI"
        )

        testCases.forEach { (given, expected) ->
            No27930().solve(given.reader().buffered()) shouldBe expected
        }
    }
})
