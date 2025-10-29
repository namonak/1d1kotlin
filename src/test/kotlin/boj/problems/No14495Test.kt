package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No14495Test : StringSpec({
    "피보나치 비스무리한 수열 : https://www.acmicpc.net/problem/14495" {
        val given = "10"
        val expected = "19"

        No14495().solve(given.reader().buffered()) shouldBe expected
    }
})
