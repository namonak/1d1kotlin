package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10940Test : StringSpec({
    "BASE16 인코딩 : https://www.acmicpc.net/problem/10940" {
        val given = "Baekjoon"
        val expected = "4261656B6A6F6F6E"

        No10940().solve(given.reader().buffered()) shouldBe expected
    }
})
