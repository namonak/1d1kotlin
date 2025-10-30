package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9656Test : StringSpec({
    "돌 게임 2 : https://www.acmicpc.net/problem/9656" {
        val given = "4"
        val expected = "SK"

        No9656().solve(given.reader().buffered()) shouldBe expected
    }
})
