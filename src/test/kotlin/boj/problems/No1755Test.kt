package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1755Test : StringSpec({
    "숫자놀이 : https://www.acmicpc.net/problem/1755" {
        val given = "8 28"
        val expected = """
        8 9 18 15 14 19 11 17 16 13
        12 10 28 25 24 21 27 26 23 22
        20
        """.trimIndent()

        No1755().solve(given.reader().buffered()) shouldBe expected
    }
})
