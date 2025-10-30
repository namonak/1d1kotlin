package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4619Test : StringSpec({
    "루트 : https://www.acmicpc.net/problem/4619" {
        val given = """
            4 3
            5 3
            27 3
            750 5
            1000 5
            2000 5
            3000 5
            1000000 5
            0 0
        """.trimIndent()
        val expected = """
            1
            2
            3
            4
            4
            4
            5
            16
        """.trimIndent()

        No4619().solve(given.reader().buffered()) shouldBe expected
    }
})
