package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No6750Test : StringSpec({
    "Rotating letters : https://www.acmicpc.net/problem/6750" {
        val given = "SHINS"
        val expected = "YES"

        No6750().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
