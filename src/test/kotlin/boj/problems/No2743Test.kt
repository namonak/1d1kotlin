package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2743Test : StringSpec({
    "단어 길이 재기 : https://www.acmicpc.net/problem/2743" {
        val given = "pulljima"
        val expected = "8"

        No2743().solve(given.reader().buffered()) shouldBe expected
    }
})
