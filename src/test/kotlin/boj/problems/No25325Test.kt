package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No25325Test : StringSpec({
    "학생 인기도 측정 : https://www.acmicpc.net/problem/25325" {
        val given = """
            4
            aaa bbb ccc ddd
            bbb ddd
            aaa ddd
            aaa
            aaa bbb
        """.trimIndent()
        val expected = """
            aaa 3
            bbb 2
            ddd 2
            ccc 0
        """.trimIndent()

        No25325().solve(given.reader().buffered()) shouldBe expected
    }
})
