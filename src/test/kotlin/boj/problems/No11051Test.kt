package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No11051Test : StringSpec({
    "이항 계수 2 : https://www.acmicpc.net/problem/11051" {
        val given = "5 2"
        val expected = "10"

        No11051().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
