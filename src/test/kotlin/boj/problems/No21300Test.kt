package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No21300Test : StringSpec({
    "Bottle Return : https://www.acmicpc.net/problem/21300" {
        val given = "0 0 0 23 3 100"
        val expected = "630"

        No21300().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
