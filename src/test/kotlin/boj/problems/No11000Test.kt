package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No11000Test : StringSpec({
    "강의실 배정 : https://www.acmicpc.net/problem/11000" {
        val given = """
            3
            1 3
            2 4
            3 5
        """.trimIndent()
        val expected = "2"

        No11000().solve(given.byteInputStream().bufferedReader()) shouldBe expected
    }
})
