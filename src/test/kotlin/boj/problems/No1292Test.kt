package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1292Test : StringSpec({
    "쉽게 푸는 문제 : https://www.acmicpc.net/problem/1292" {
        val given = "3 7"
        val expected = "15"

        No1292().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
