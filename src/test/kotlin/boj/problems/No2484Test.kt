package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No2484Test : StringSpec({
    "주사위 네개 : https://www.acmicpc.net/problem/2484" {
        val given = """
            4
            3 3 3 3
            3 3 6 3
            2 2 6 6
            6 2 1 5
        """.trimIndent()
        val expected = "65000"

        No2484().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
