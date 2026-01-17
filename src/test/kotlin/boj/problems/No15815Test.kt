package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No15815Test : StringSpec({
    "천재 수학자 성필 : https://www.acmicpc.net/problem/15815" {
        val given = "123*+"
        val expected = "7"

        No15815().solve(given.reader().buffered()) shouldBe expected
    }
})
