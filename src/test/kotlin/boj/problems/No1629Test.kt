package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1629Test : StringSpec({
    "곱셈 : https://www.acmicpc.net/problem/1629" {
        val given = "10 11 12"
        val expected = "4"

        No1629().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
