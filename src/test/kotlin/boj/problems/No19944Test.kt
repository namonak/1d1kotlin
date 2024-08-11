package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No19944Test : StringSpec({
    "뉴비의 기준은 뭘까? : https://www.acmicpc.net/problem/19944" {
        val testCases = listOf(
            "3 1" to "NEWBIE!",
            "3 5" to "TLE!",
            "3 3" to "OLDBIE!"
        )

        testCases.forEach { (given, expected) ->
            No19944().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
