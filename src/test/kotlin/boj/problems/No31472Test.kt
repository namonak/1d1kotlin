package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No31472Test : StringSpec({
    "갈래의 색종이 자르기 : https://www.acmicpc.net/problem/31472" {
        val given = "18"
        val expected = "24"

        No31472().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
