package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No8370Test : StringSpec({
    "Plane : https://www.acmicpc.net/problem/8370" {
        val given = "2 5 3 20"
        val expected = "70"

        No8370().solve(given.reader().buffered()) shouldBe expected
    }
})
