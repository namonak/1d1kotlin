package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9461Test : StringSpec({
    "파도반 수열 : https://www.acmicpc.net/problem/9461" {
        val given = "2\n6\n12"
        val expected = "3\n16"

        No9461.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
