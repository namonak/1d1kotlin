package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No26082Test : StringSpec({
    "WARBOY : https://www.acmicpc.net/problem/26082" {
        val given = "10 100 7"
        val expected = "210"

        No26082().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
