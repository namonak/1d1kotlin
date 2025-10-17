package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1789Test : StringSpec({
    "수들의 합 : https://www.acmicpc.net/problem/1789" {
        val given = "200"
        val expected = "19"

        No1789().solve(given.reader().buffered()) shouldBe expected
    }
})
