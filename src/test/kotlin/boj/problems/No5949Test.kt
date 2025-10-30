package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No5949Test : StringSpec({
    "Adding Commas : https://www.acmicpc.net/problem/5949" {
        val given = "153920529"
        val expected = "153,920,529"

        No5949().solve(given.reader().buffered()) shouldBe expected
    }
})
