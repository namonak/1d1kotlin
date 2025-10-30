package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10808Test : StringSpec({
    "알파벳 개수 : https://www.acmicpc.net/problem/10808" {
        val given = "baekjoon"
        val expected = "1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0"

        No10808().solve(given.reader().buffered()) shouldBe expected
    }
})
