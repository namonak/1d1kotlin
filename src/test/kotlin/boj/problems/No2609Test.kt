package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No2609Test : StringSpec({
    "최대공약수와 최소공배수 : https://www.acmicpc.net/problem/2609" {
        val given = "24 18"
        val expected = "6\n72"

        val actual = No2609.solve(BufferedReader(given.reader()))

        actual shouldBe expected
    }
})
