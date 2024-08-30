package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.BufferedReader

class No26594Test : StringSpec({
    "ZOAC 5 : https://www.acmicpc.net/problem/26594" {
        val given = "ZZZOOOAAACCC"
        val expected = "3"

        No26594().solve(BufferedReader(given.reader())) shouldBe expected
    }
})
