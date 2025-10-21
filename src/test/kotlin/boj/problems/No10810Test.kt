package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No10810Test : StringSpec({
    "공 넣기 : https://www.acmicpc.net/problem/10810" {
        val given = """
            5 4
            1 2 3
            3 4 4
            1 4 1
            2 2 2
        """.trimIndent()
        val expected = "1 2 1 1 0"

        No10810().solve(given.reader().buffered()) shouldBe expected
    }
})
