package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15633Test : StringSpec({
    "Fan Death : https://www.acmicpc.net/problem/15633" {
        val given = "5"
        val expected = "6"

        No15633().solve(given.reader().buffered()) shouldBe expected
    }
})
