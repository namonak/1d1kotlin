package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2420Test : StringSpec({
    "사파리월드 : https://www.acmicpc.net/problem/2420" {
        val given = "-2 5"
        val expected = 7

        No2420.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
