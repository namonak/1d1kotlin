package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9657Test : StringSpec({
    "돌 게임 3 : https://www.acmicpc.net/problem/9657" {
        val given = "6"
        val expected = "SK"

        No9657().solve(given.reader().buffered()) shouldBe expected
    }
})
