package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10941Test : StringSpec({
    "BASE16 디코딩 : https://www.acmicpc.net/problem/10941" {
        val given = "4261656B6A6F6F6E"
        val expected = "Baekjoon"

        No10941().solve(given.reader().buffered()) shouldBe expected
    }
})
