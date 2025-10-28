package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1373Test : StringSpec({
    "2진수 8진수 : https://www.acmicpc.net/problem/1373" {
        val given = "11001100"
        val expected = "314"

        No1373().solve(given.reader().buffered()) shouldBe expected
    }
})
