package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader
import java.io.StringReader

class No2558Test : StringSpec({
    "A+B - 2 : https://www.acmicpc.net/problem/2558" {
        val given = "1\n2"
        val expected = "3"

        val actual = No2558().solve(BufferedReader(StringReader(given)))

        actual shouldBe expected
    }
})
