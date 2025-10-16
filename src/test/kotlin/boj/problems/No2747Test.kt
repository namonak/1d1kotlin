package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2747Test : StringSpec({
    "피보나치 수 : https://www.acmicpc.net/problem/2747" {
        val given = "10"
        val expected = "55"

        val actual = No2747().solve(given.reader().buffered())

        actual shouldBe expected
    }
})
