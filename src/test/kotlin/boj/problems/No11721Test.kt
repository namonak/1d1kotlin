package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11721Test : StringSpec({
    "열 개씩 끊어 출력하기 : https://www.acmicpc.net/problem/11721" {
        val testCases = listOf(
            "BaekjoonOnlineJudge" to """
                BaekjoonOn
                lineJudge
            """.trimIndent(),
            "OneTwoThreeFourFiveSixSevenEightNineTen" to """
                OneTwoThre
                eFourFiveS
                ixSevenEig
                htNineTen
            """.trimIndent()
        )

        testCases.forEach { (given, expected) ->
            val actual = No11721().solve(given.reader().buffered())
            actual shouldBe expected
        }
    }
})
