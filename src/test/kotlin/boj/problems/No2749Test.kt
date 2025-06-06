package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2749Test : StringSpec({
    "피보나치 수 3 : https://www.acmicpc.net/problem/2749" {
        val given = "1000"
        val expected = "228875"

        No2749().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
