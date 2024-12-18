package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No25311Test : StringSpec({
    "UCPC에서 가장 쉬운 문제 번호는? : https://www.acmicpc.net/problem/25311" {
        val given = "2018"
        val expected = "A"

        No25311().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
