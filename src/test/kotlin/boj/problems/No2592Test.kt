package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2592Test : StringSpec({
    "대표값 : https://www.acmicpc.net/problem/2592" {
        val given = "10\n40\n30\n60\n30\n20\n60\n30\n40\n50"
        val expected = "37\n30"

        No2592.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
