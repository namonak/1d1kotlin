package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No9205Test : StringSpec({
    "맥주 마시면서 걸어가기 : https://www.acmicpc.net/problem/9205" {
        val given = """
            2
            2
            0 0
            1000 0
            1000 1000
            2000 1000
            2
            0 0
            1000 0
            2000 1000
            2000 2000
        """.trimIndent()
        val expected = """
            happy
            sad
        """.trimIndent()

        No9205().solve(given.reader().buffered()) shouldBe expected
    }
})
