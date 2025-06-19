package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No14935Test : StringSpec({
    "FA : https://www.acmicpc.net/problem/14935" {
        val given = "932"
        val expected = "FA"

        val result = No14935().solve(BufferedReader(given.reader()))
        result shouldBe expected
    }
})
