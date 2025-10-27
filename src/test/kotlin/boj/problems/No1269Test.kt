package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No1269Test : StringSpec({
    "대칭 차집합 : https://www.acmicpc.net/problem/1269" {
        val given = """
            3 5
            1 2 4
            2 3 4 5 6
        """.trimIndent()
        val expected = "4"

        No1269().solve(given.reader().buffered()) shouldBe expected
    }
})
