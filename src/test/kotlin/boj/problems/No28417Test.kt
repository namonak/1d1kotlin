package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No28417Test : StringSpec({
    "스케이트보드 : https://www.acmicpc.net/problem/28417" {
        val given = """
            2
            1 2 4 2 3 1 1
            5 5 5 5 5 5 5
        """.trimIndent()
        val expected = "15"

        No28417().solve(given.reader().buffered()) shouldBe expected
    }
})
