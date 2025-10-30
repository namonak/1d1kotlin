package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1309Test : StringSpec({
    "동물원 : https://www.acmicpc.net/problem/1309" {
        val given = "4"
        val expected = "41"

        No1309().solve(given.reader().buffered()) shouldBe expected
    }
})
