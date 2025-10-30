package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1380Test : StringSpec({
    "귀걸이 : https://www.acmicpc.net/problem/1380" {
        val given = """
            3
            Betty Boolean
            Alison Addaway
            Carrie Carryon
            1 B
            2 A
            3 B
            3 A
            1 A
            2
            Helen Clark
            Margaret Thatcher
            1 B
            2 B
            2 A
            0
        """.trimIndent()
        val expected = """
            1 Alison Addaway
            2 Helen Clark
        """.trimIndent()

        No1380().solve(given.reader().buffered()) shouldBe expected
    }
})
