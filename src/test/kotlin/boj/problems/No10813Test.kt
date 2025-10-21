package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10813Test : StringSpec({
    "공 바꾸기 : https://www.acmicpc.net/problem/10813" {
        val given = """
            5 4
            1 2
            3 4
            1 4
            2 2
        """.trimIndent()
        val expected = "3 1 4 2 5"

        No10813().solve(given.reader().buffered()) shouldBe expected
    }
})
