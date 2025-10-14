package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2475Test : StringSpec({
    "검증수 : https://www.acmicpc.net/problem/2475" {
        val given = "0 4 2 5 6"
        val expected = "1"

        val actual = No2475().solve(given.reader().buffered())

        actual shouldBe expected
    }
})
