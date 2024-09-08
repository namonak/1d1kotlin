package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1697Test : StringSpec({
    "숨바꼭질 : https://www.acmicpc3.net/problem/1697" {
        val given = "5 17"
        val expected = "4"

        No1697().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
