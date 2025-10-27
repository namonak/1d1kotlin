package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11866Test : StringSpec({
    "요세푸스 문제 0 : https://www.acmicpc.net/problem/11866" {
        val given = "7 3"
        val expected = "<3, 6, 2, 7, 5, 1, 4>"

        No11866().solve(given.reader().buffered()) shouldBe expected
    }
})
