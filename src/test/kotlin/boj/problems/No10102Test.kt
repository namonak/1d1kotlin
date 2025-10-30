package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10102Test : StringSpec({
    "개표 : https://www.acmicpc.net/problem/10102" {
        val given = """
            6
            ABBABB
        """.trimIndent()
        val expected = "B"

        No10102().solve(given.reader().buffered()) shouldBe expected
    }
})
