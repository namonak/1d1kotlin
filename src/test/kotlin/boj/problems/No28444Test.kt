package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No28444Test : StringSpec({
    "HI-ARC=? : https://www.acmicpc.net/problem/28444" {
        val given = "4 6 1 2 3"
        val expected = "18"

        No28444().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
