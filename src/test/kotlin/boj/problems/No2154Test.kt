package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2154Test : StringSpec({
    "수 이어 쓰기 3 : https://www.acmicpc.net/problem/2154" {
        val testCases = listOf(
            "1" to "1",
            "15" to "20",
            "34" to "3",
            "142" to "73"
        )

        testCases.forEach { (given, expected) ->
            No2154.solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
