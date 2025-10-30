package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1252Test : StringSpec({
    "이진수 덧셈 : https://www.acmicpc.net/problem/1252" {
        val given = "1001101 10010"
        val expected = "1011111"

        No1252().solve(given.reader().buffered()) shouldBe expected
    }
})
