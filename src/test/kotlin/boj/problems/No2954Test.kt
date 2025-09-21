package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2954Test : StringSpec({
    "창영이의 일기장 : https://www.acmicpc.net/problem/2954" {
        val testCases = listOf(
            "zepelepenapa papapripikapa" to "zelena paprika",
            "bapas jepe doposapadnapa opovapa kepemipijapa " to "bas je dosadna ova kemija"
        )

        for ((given, expected) in testCases) {
            val result = No2954().solve(given.reader().buffered())
            result shouldBe expected
        }
    }
})
