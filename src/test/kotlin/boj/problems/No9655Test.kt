package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9655Test : StringSpec({
    "돌 게임 : https://www.acmicpc.net/problem/9655" {
        val given = "5"
        val expected = "SK"

        No9655().solve(given.reader().buffered()) shouldBe expected
    }
})
