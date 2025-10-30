package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4299Test : StringSpec({
    "AFC 윔블던 : https://www.acmicpc.net/problem/4299" {
        val given = "3 1"
        val expected = "2 1"

        No4299().solve(given.reader().buffered()) shouldBe expected
    }
})
