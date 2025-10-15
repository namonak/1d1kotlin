package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No30700Test : StringSpec({
    "KOREA 문자열 만들기 : https://www.acmicpc.net/problem/30700" {
        val testCases = listOf(
            "KEKRORKAKROEKREORKA" to "5",
            "OOOOOOOREA" to "0",
            "KEROKRKKAKAOA" to "3"
        )

        testCases.forEach { (given, expected) ->
            No30700().solve(given.byteInputStream().bufferedReader()) shouldBe expected
        }
    }
})
