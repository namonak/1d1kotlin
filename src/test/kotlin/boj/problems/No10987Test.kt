package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10987Test : StringSpec({
    "모음의 개수 : https://www.acmicpc.net/problem/10987" {
        val given = "baekjoon"
        val expected = "4"

        No10987().solve(given.reader().buffered()) shouldBe expected
    }
})
