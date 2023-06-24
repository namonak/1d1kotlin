package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No1312Test : StringSpec({
    "소수 : https://www.acmicpc.net/problem/1312" {
        val given = "25 7 5"
        val expected = 2

        val actual = No1312.solve(BufferedReader(given.reader()))

        actual shouldBe expected
    }
})
