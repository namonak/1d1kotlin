package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4732Test : StringSpec({
    "조옮김 : https://www.acmicpc.net/problem/4732" {
        val given = """
            C# E Db G#
            1
            D E# D A
            -1
            ***
        """.trimIndent()
        val expected = """
            D F D A
            C# E C# G#
        """.trimIndent()

        No4732().solve(given.reader().buffered()) shouldBe expected
    }
})
