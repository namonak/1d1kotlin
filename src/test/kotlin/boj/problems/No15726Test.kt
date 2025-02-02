package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No15726Test : StringSpec({
    "이칙연산 : https://www.acmicpc.net/problem/15726" {
        val given = "32 16 8"
        val expected = "64"

        No15726().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
