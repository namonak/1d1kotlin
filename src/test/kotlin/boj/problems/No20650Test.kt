package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No20650Test : StringSpec({
    "Do You Know Your ABCs? : https://www.acmicpc.net/problem/20650" {
        val given = "2 2 11 4 9 7 9"
        val expected = "2 2 7"

        No20650().solve(given.reader().buffered()) shouldBe expected
    }
})
