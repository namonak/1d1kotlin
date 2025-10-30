package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8394Test : StringSpec({
    "악수 : https://www.acmicpc.net/problem/8394" {
        val given = "4"
        val expected = "5"

        No8394().solve(given.reader().buffered()) shouldBe expected
    }
})
