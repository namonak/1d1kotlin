package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8545Test : StringSpec({
    "Zadanie próbne : https://www.acmicpc.net/problem/8545" {
        val given = "abc"
        val expected = "cba"

        No8545().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
