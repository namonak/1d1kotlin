package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1225Test : StringSpec({
    "이상한 곱셈 : https://www.acmicpc.net/problem/1225" {
        val given = "123 45"
        val expected = "54"

        No1225().solve(given.reader().buffered()) shouldBe expected
    }
})
