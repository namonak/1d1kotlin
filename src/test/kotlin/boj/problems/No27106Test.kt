package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No27106Test : StringSpec({
    "Making Change : https://www.acmicpc.net/problem/27106" {
        val given = "43"
        val expected = "2 0 1 2"

        val actual = No27106().solve(BufferedReader(given.reader()))
        actual shouldBe expected
    }
})
