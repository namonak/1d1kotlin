package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1550Test : StringSpec({
    "16진수 : https://www.acmicpc.net/problem/1550" {
        val given = "A"
        val expected = "10"

        No1550().solve(given.reader().buffered()) shouldBe expected
    }
})
