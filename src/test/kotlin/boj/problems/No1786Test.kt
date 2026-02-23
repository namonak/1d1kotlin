package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1786Test : StringSpec({
    "찾기 : https://www.acmicpc.net/problem/1786" {
        val given = """
            ABC ABCDAB ABCDABCDABDE
            ABCDABD
        """.trimIndent()
        val expected = """
            1
            16
        """.trimIndent()

        No1786().solve(given.reader().buffered()) shouldBe expected
    }
})
