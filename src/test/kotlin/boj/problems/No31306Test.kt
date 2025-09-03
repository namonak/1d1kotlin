package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No31306Test : StringSpec({
    "Is Y a Vowel : https://www.acmicpc.net/problem/31306" {
        val given = "asdfiy"
        val expected = "2 3"

        val result = No31306().solve(given.reader().buffered())
        result shouldBe expected
    }
})
