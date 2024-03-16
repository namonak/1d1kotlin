package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No16483Test : StringSpec({
    "접시 안의 원 : https://www.acmicpc.net/problem/16483" {
        val given = "17"
        val expected = "72"
        No16483().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
