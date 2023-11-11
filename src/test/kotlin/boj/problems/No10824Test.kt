package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10824Test : StringSpec({
    "네 수 : https://www.acmicpc.net/problem/10824" {
        val given = "10 20 30 40"
        val expected = "4060"

        No10824.solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
