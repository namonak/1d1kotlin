package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11050Test : StringSpec({
    "이항 계수 1 : https://www.acmicpc.net/problem/11050" {
        val given = "5 2"
        val expected = 10

        No11050().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
