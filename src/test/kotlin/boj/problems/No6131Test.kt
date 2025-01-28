package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No6131Test : StringSpec({
    "완전 제곱수 : https://www.acmicpc.net/problem/6131" {
        val given = "15"
        val expected = "2"

        No6131().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
