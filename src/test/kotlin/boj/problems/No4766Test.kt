package boj.problems

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class No4766Test : StringSpec({
    "일반 화학 실험 : https://www.acmicpc.net/problem/4766" {
        val given = """
            10.0
            12.05
            30.25
            20
            999
        """.trimIndent()
        val expected = """
            2.05
            18.20
            -10.25
        """.trimIndent()

        No4766().solve(given.reader().buffered()) shouldBe expected
    }
})
