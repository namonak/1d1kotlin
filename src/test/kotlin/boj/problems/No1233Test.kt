package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1233Test : StringSpec({
    "주사위 : https://www.acmicpc.net/problem/1233" {
        val given = "3 2 3"
        val expected = "5"

        No1233().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
