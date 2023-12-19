package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16394Test : StringSpec({
    "홍익대학교 : https://www.acmicpc.net/problem/16394" {
        val given = "2018"
        val expected = "72"

        No16394.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
