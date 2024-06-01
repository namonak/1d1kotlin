package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No19564Test : StringSpec({
    "반복 : https://www.acmicpc.net/problem/19564" {
        val given = "polymath"
        val expected = "6"

        No19564().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
