package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28691Test : StringSpec({
    "정보보호학부 동아리 소개 : https://www.acmicpc.net/problem/28691" {
        val testCases = listOf(
            "M" to "MatKor",
            "W" to "WiCys",
            "C" to "CyKor",
            "A" to "AlKor",
            "$" to "\$clear"
        )

        testCases.forEach { (given, expected) ->
            No28691.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
