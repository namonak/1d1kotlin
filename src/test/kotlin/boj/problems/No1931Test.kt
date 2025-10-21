package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1931Test : StringSpec({
    "회의실 배정 : https://www.acmicpc.net/problem/1931" {
        val given = """
            11
            1 4
            3 5
            0 6
            5 7
            3 8
            5 9
            6 10
            8 11
            8 12
            2 13
            12 14
        """.trimIndent()
        val expected = "4"

        No1931().solve(given.reader().buffered()) shouldBe expected
    }
})
