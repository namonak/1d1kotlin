package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10826Test : StringSpec({
    "피보나치 수 4 : https://www.acmicpc.net/problem/10826" {
        val given = "10"
        val expected = "55"

        No10826().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
