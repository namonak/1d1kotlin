package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2018Test : StringSpec({
    "수들의 합 5 : https://www.acmicpc.net/problem/2018" {
        val given = "15"
        val expected = "4"

        No2018().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
